@java.lang.Override
public void onSuccess(java.lang.Void result) {
    System.out.println("log");
    com.google.gwt.user.client.Window.alert("Nuter wurde gelöscht");
    de.hdm.itprojekt.noteit.client.EditNotebook.getAllPermittedUsersbyNotebookID(de.hdm.itprojekt.noteit.client.EditNotebook.currentNotebook.getId());
}
