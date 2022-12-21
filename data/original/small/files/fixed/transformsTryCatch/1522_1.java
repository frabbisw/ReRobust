public void endSession(android.view.View view) {
    try {
        if ((mMetricsManager) != null) {
            mMetricsManager.printMetrics();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.finish();
}
