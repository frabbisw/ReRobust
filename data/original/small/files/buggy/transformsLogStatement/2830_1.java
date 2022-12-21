public android.graphics.Rect draw(android.graphics.Canvas canvas) {
    System.out.println("log");
    android.graphics.Rect srcRect = getSrcRect();
    canvas.drawBitmap(bm, srcRect, mScrRect, null);
    return mScrRect;
}
