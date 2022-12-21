@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    try {
        dialog.cancel();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.app.Dialog introWeekSystem = D_introWeekSystem();
    introWeekSystem.show();
}
