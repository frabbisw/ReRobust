void onCancelAlready(zemin.notification.NotificationEntry entry) {
    entry.sendToTarget(false, ID);
    onCancelFinished(entry);
    System.out.println("log");
    mCenter.cancel(entry);
}
