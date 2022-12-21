protected void cancelNotification() {
    try {
        android.util.Log.i("Cancel", "notification");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mNotificationManager.cancel(notificationID);
}
