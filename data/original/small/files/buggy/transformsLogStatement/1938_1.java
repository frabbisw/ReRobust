private void cancelAlarmManager() {
    android.util.Log.i(com.example.sifat.gobar.LOG_TAG_TAXIPOSITIONSERVICE, "cancelAlarmManager");
    System.out.println("log");
    android.content.Context context = getBaseContext();
    alarmManager.cancel(pendingIntent);
}
