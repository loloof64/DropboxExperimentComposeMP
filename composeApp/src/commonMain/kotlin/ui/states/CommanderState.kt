package ui.states

import models.FileItem

data class DropboxAccount(val accountName: String, val profileImageUrl: String)

data class CommanderState(
    val localExplorerState: FileExplorerState,
    val dropBoxExplorerState: FileExplorerState,
    val dropBoxAccount: DropboxAccount?
)

sealed class FileExplorerState {
    data object NotAvailable : FileExplorerState()
    data object Loading : FileExplorerState()
    data class Ready(
        val currentPath: String = "",
        val items: List<FileItem> = listOf(),
    ) : FileExplorerState()
}