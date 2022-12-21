public void updateScreen(android.graphics.Canvas canvas) {
    android.graphics.Paint paintBackground = new android.graphics.Paint();
    try {
        canvas.drawBitmap(mBackground, 0, 0, paintBackground);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mNote.update(canvas);
    mScoreBar.update(canvas);
}
