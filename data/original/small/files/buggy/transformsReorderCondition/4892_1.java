public void zoomVertical() {
    chart.zoomToCenter(0, ((settings.getPoolSettings().getZoomingMultiplier()) + 1));
    chart.postInvalidate();
}
