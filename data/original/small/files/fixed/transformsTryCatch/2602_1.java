public void myDraw(android.graphics.Canvas canvas) {
    canvas.drawBitmap(mBitmapBackground, 0, 0, null);
    try {
        mGroup.drawAll(canvas);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
