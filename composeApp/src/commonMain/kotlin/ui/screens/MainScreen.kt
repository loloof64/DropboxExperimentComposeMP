package ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.model.rememberScreenModel
import cafe.adriel.voyager.core.screen.Screen
import dropboxexperiment.composeapp.generated.resources.Res
import dropboxexperiment.composeapp.generated.resources.dropbox_filesystem
import dropboxexperiment.composeapp.generated.resources.local_filesystem
import dropboxexperiment.composeapp.generated.resources.reload
import models.FileItem
import org.jetbrains.compose.resources.stringResource
import ui.composables.FileExplorer
import ui.composables.Loading
import ui.composables.NotAvailable
import ui.states.FileExplorerState
import ui.viewmodels.CommanderScreenModel

class MainScreen : Screen {
    @Composable
    override fun Content() {
        val screenModel = rememberScreenModel { CommanderScreenModel() }
        val state = screenModel.uiState.collectAsState()

        fun reloadLocalExplorer() {
            screenModel.updateLocalExplorerItemsForCurrentPath()
        }

        Scaffold(modifier = Modifier.fillMaxSize()) {
            Row {
                LocalExplorer(
                    modifier = Modifier.fillMaxWidth(0.5f).fillMaxHeight(),
                    screenModel = screenModel,
                    localExplorerState = state.value.localExplorerState
                ) {
                    ExplorerActionsBar(
                        modifier = Modifier.height(45.dp),
                        title = stringResource(Res.string.local_filesystem),
                        backgroundColor = MaterialTheme.colors.primary,
                        textColor = MaterialTheme.colors.onPrimary,
                        actions = listOf(
                            ExplorerAction(
                                image = Icons.Default.Refresh,
                                description = stringResource(Res.string.reload),
                                callback = ::reloadLocalExplorer
                            )
                        )
                    )
                }
                DropboxExplorer(
                    modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                    dropboxExplorerState = state.value.dropBoxExplorerState
                ) {
                    ExplorerActionsBar(
                        modifier = Modifier.height(45.dp),
                        title = stringResource(Res.string.dropbox_filesystem),
                        backgroundColor = MaterialTheme.colors.secondary,
                        textColor = MaterialTheme.colors.onSecondary
                    )
                }
            }
        }
    }
}

@Composable
private fun LocalExplorer(
    modifier: Modifier = Modifier,
    localExplorerState: FileExplorerState,
    screenModel: CommanderScreenModel,
    ActionsBar: @Composable () -> Unit = {},
) {
    fun onItemSelected(item: FileItem) {
        if (!item.isFolder) return
        screenModel.enterLocalSubdirectory(item.name)
    }

    Column(modifier = modifier, verticalArrangement = Arrangement.Top) {
        ActionsBar()
        when (localExplorerState) {
            is FileExplorerState.NotAvailable -> NotAvailable(modifier = modifier)
            is FileExplorerState.Loading -> Loading(modifier = modifier)
            is FileExplorerState.Ready -> FileExplorer(
                items = localExplorerState.items,
                currentPath = localExplorerState.currentPath,
                onItemSelected = ::onItemSelected,
            )
        }
    }
}

@Composable
private fun DropboxExplorer(
    modifier: Modifier = Modifier,
    dropboxExplorerState: FileExplorerState,
    ActionsBar: @Composable () -> Unit = {},
) {
    Column(modifier = modifier, verticalArrangement = Arrangement.Top) {
        ActionsBar()
        when (dropboxExplorerState) {
            is FileExplorerState.NotAvailable -> NotAvailable(modifier = modifier)
            is FileExplorerState.Loading -> Loading(modifier = modifier)
            is FileExplorerState.Ready -> FileExplorer(
                items = dropboxExplorerState.items,
                currentPath = dropboxExplorerState.currentPath
            )
        }
    }
}

@Composable
private fun ExplorerActionsBar(
    modifier: Modifier = Modifier,
    title: String,
    actions: List<ExplorerAction> = listOf(),
    backgroundColor: Color,
    textColor: Color
) {

    Row(
        modifier = modifier.fillMaxWidth().background(backgroundColor),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            modifier = Modifier.weight(1f).padding(8.dp),
            text = title,
            fontWeight = FontWeight.Bold,
            color = textColor
        )
        for (currentAction in actions) {
            IconButton(onClick = { currentAction.callback() }) {
                Icon(
                    tint = textColor,
                    imageVector = currentAction.image,
                    contentDescription = currentAction.description,
                    modifier = Modifier.size(20.dp)
                )
            }
        }
    }
}

private data class ExplorerAction(val image: ImageVector, val description: String, val callback: () -> Unit)