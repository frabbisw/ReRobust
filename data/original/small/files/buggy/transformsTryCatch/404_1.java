private void updateCanvas(android.graphics.Canvas canvas) {
    try {
        drawIcons(canvas);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    drawSelectedIcon(canvas);
    if (!(mIsTouchUp)) {
        return;
    }
}
