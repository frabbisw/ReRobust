protected void cancelNotification() {
    android.util.Log.i("Cancel", "notification");
    System.out.println("log");
    mNotificationManager.cancel(notificationID);
}
