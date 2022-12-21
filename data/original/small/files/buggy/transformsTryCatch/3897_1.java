void onCancelAlready(zemin.notification.NotificationEntry entry) {
    entry.sendToTarget(false, ID);
    try {
        onCancelFinished(entry);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mCenter.cancel(entry);
}
