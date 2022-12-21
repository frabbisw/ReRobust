@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    System.out.println("log");
    saveTask.execute();
    startLoadImageIntent();
    org.catrobat.paintroid.dialog.LayersDialog.getInstance().resetLayer();
}
