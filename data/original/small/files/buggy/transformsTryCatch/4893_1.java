@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    canvas.drawRoundRect(edgeRect, rx, rx, edgePaint);
    try {
        fillButton.draw(canvas);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
