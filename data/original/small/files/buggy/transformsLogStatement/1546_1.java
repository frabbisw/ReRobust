public void drawBackground(android.graphics.Canvas canvas) {
    System.out.println("log");
    if ((mAmbient) && ((!(mLowBitAmbient)) || (mBurnInProtection))) {
        canvas.drawColor(Color.BLACK);
    } else {
        canvas.drawColor(mCenterCircleColor);
    }
}
