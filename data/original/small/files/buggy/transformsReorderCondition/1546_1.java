public void drawBackground(android.graphics.Canvas canvas) {
    if (((!(mLowBitAmbient)) || (mBurnInProtection)) && (mAmbient)) {
        canvas.drawColor(Color.BLACK);
    } else {
        canvas.drawColor(mCenterCircleColor);
    }
}
