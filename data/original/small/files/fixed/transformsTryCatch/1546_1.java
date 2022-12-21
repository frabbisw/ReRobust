private void drawBackground(android.graphics.Canvas canvas) {
    try {
        if ((mAmbient) && ((!(mLowBitAmbient)) || (mBurnInProtection))) {
            canvas.drawColor(Color.BLACK);
        } else {
            canvas.drawColor(mCenterCircleColor);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
