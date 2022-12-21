@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    System.out.println("log");
    canvas.drawRoundRect(edgeRect, rx, rx, edgePaint);
    fillButton.draw(canvas);
}
