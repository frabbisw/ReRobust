private void cancelAlarmManager() {
    try {
        android.util.Log.i(com.example.sifat.gobar.LOG_TAG_TAXIPOSITIONSERVICE, "cancelAlarmManager");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    alarmManager.cancel(pendingIntent);
}
