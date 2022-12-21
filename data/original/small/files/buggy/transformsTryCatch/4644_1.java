@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    saveTask.execute();
    try {
        startLoadImageIntent();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.catrobat.paintroid.dialog.LayersDialog.getInstance().resetLayer();
}
