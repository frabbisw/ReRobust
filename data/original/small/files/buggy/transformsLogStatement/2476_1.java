@java.lang.Override
public void drawRect(int x, int y, int w, int h) {
    System.out.println("log");
    currentPaint.setStyle(Paint.Style.STROKE);
    back.drawRect(x, y, (x + w), (x + h), currentPaint);
}
