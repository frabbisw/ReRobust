void onCancelAlready(zemin.notification.NotificationEntry entry) {
    try {
        onCancelFinished(entry);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mCenter.cancel(entry);
}
