private void updateCanvas(android.graphics.Canvas canvas) {
    drawIcons(canvas);
    try {
        drawSelectedIcon(canvas);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
