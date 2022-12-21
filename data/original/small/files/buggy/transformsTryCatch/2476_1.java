@java.lang.Override
public void drawRect(int x, int y, int w, int h) {
    currentPaint.setStyle(Paint.Style.STROKE);
    try {
        back.drawRect(x, y, (x + w), (x + h), currentPaint);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
