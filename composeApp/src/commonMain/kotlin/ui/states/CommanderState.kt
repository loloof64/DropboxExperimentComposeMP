package ui.states

import models.FileItem

data class CommanderState (val localExplorerState: FileExplorerState, val dropBoxExplorerState: FileExplorerState)

sealed class FileExplorerState {
    data object NotAvailable: FileExplorerState()
    data object Loading: FileExplorerState()
    data class Ready(
        val currentPath: String = "",
        val items: List<FileItem> = listOf(),
    ): FileExplorerState()
}