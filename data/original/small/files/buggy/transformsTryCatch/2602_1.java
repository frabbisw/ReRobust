public void myDraw(android.graphics.Canvas canvas) {
    try {
        canvas.drawBitmap(mBitmapBackground, 0, 0, null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.util.Log.d(com.example.balloonpop.GameView.TAG, "myDraw draw background");
    mGroup.drawAll(canvas);
}
