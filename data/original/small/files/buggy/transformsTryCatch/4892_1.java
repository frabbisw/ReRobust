public void zoomVertical() {
    try {
        chart.zoomToCenter(0, (1 + (settings.getPoolSettings().getZoomingMultiplier())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    chart.postInvalidate();
}
