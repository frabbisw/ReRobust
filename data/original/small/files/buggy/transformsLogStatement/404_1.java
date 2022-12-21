private void updateCanvas(android.graphics.Canvas canvas) {
    System.out.println("log");
    drawIcons(canvas);
    drawSelectedIcon(canvas);
    if (!(mIsTouchUp)) {
        return;
    }
}
