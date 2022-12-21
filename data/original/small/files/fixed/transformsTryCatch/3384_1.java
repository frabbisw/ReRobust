@java.lang.Override
public void onSuccess(java.lang.Void result) {
    try {
        de.hdm.itprojekt.noteit.client.EditNotebook.getAllPermittedUsersbyNotebookID(de.hdm.itprojekt.noteit.client.EditNotebook.currentNotebook.getId());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
