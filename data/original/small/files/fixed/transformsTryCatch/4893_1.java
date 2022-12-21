@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    try {
        canvas.drawRoundRect(edgeRect, rx, rx, edgePaint);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
