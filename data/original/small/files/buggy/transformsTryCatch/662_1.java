public void onClick(android.content.DialogInterface dialog, int id) {
    canActivateAlarmNow = false;
    try {
        cancelAlarm(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
