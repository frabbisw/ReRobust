@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    try {
        deleteSelectedSites();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    disableActionMode();
}
