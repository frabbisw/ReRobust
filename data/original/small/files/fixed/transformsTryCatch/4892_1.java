public void zoomVertical() {
    chart.zoomToCenter(1, (1 + (settings.getPoolSettings().getZoomingMultiplier())));
    try {
        chart.postInvalidate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
