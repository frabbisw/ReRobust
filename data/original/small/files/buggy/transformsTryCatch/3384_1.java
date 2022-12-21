@java.lang.Override
public void onSuccess(java.lang.Void result) {
    try {
        com.google.gwt.user.client.Window.alert("Nuter wurde gelöscht");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    de.hdm.itprojekt.noteit.client.EditNotebook.getAllPermittedUsersbyNotebookID(de.hdm.itprojekt.noteit.client.EditNotebook.currentNotebook.getId());
}
