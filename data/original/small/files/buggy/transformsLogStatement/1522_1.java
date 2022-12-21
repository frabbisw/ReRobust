public void endSession(android.view.View view) {
    System.out.println("log");
    mMetricsManager.printMetrics();
    this.finish();
}
