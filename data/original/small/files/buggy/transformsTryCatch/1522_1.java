public void endSession(android.view.View view) {
    try {
        mMetricsManager.printMetrics();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.finish();
}
