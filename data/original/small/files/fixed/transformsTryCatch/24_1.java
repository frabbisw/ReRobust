private void startScreenshots() {
    android.content.Intent intent = new android.content.Intent(this, csci435.csci435_odbr.SnapshotIntentService.class);
    try {
        startService(intent);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
