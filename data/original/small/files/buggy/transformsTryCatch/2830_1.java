public android.graphics.Rect draw(android.graphics.Canvas canvas) {
    android.graphics.Rect srcRect = getSrcRect();
    try {
        canvas.drawBitmap(bm, srcRect, mScrRect, null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return mScrRect;
}
