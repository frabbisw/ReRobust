@java.lang.Override
public void drawRect(int x, int y, int w, int h) {
    currentPaint.setStyle(Paint.Style.STROKE);
    try {
        back.drawRect(x, y, (x + w), (y + h), currentPaint);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
