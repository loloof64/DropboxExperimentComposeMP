package ui.viewmodels

import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.core.model.screenModelScope
import getStartDirectory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import models.FileItem
import models.sort
import okio.FileSystem
import okio.Path.Companion.toPath
import ui.states.CommanderState
import ui.states.FileExplorerState

class CommanderScreenModel : ScreenModel {
    private val _uiState: MutableStateFlow<CommanderState> = MutableStateFlow(
        CommanderState(
            localExplorerState = FileExplorerState.Loading,
            dropBoxExplorerState = FileExplorerState.NotAvailable
        )
    )
    var uiState = _uiState.asStateFlow()

    init {
        val startDirectory = getStartDirectory()
        _uiState.update {
            it.copy(
                localExplorerState = FileExplorerState.Ready(
                    currentPath = FileSystem.SYSTEM.canonicalize(startDirectory.toPath()).toString(),
                    items = listOf()
                )
            )
        }
        screenModelScope.launch(Dispatchers.Default) {
            when (val localExplorerState = _uiState.value.localExplorerState) {
                is FileExplorerState.Ready -> updateLocalExplorerItems(localExplorerState.currentPath)
                else -> {}
            }
        }
    }

    fun updateLocalExplorerItemsForCurrentPath() {
        when (val localExplorerState = _uiState.value.localExplorerState) {
            is FileExplorerState.Ready -> {
                val currentPathStr = localExplorerState.currentPath
                val currentPath = currentPathStr.toPath()
                screenModelScope.launch {
                    val newPathStr = FileSystem.SYSTEM.canonicalize(currentPath).toString()
                    updateLocalExplorerItems(newPathStr)
                }
            }

            else -> {}
        }
    }

    private suspend fun updateLocalExplorerItems(newPath: String) {
        when (val localExplorerState = _uiState.value.localExplorerState) {
            is FileExplorerState.Ready -> {
                coroutineScope {
                    withContext(Dispatchers.Default) {
                        val rawElementsList = FileSystem.SYSTEM.list(newPath.toPath())
                        val newElementsList = rawElementsList.map {
                            FileItem(it.toFile().isDirectory, it.name)
                        }.sort()
                        // Adds the go back item if possible.
                        val result = if (newPath.toPath().toFile().parentFile == null) newElementsList else listOf(
                            FileItem(
                                true,
                                ".."
                            )
                        ) + newElementsList

                        withContext(Dispatchers.Main) {
                            _uiState.update { commanderState ->
                                commanderState.copy(localExplorerState = localExplorerState.copy(items = result))
                            }
                        }
                    }
                }
            }

            else -> {}
        }
    }
}