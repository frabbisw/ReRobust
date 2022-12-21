public void exportRendering() {
    try {
        mRenderWindow.exportRendering(java.lang.String.valueOf(raytracer.Raytracer.stopTime(tStart)), mMaxRecursions, (((int) (mAntiAliasingSamples)) * 2), mDebug, mGiLevel, mGiSamples);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
