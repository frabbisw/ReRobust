@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.cancel();
    android.app.Dialog introWeekSystem = D_introWeekSystem();
    System.out.println("log");
    introWeekSystem.show();
}
