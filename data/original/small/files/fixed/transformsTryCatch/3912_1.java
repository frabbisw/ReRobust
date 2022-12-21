public void exportRendering() {
    try {
        mRenderWindow.exportRendering(java.lang.String.valueOf(raytracer.Raytracer.stopTime(tStart)), mMaxRecursions, ((int) (mAntiAliasingSamples)), mDebug, mGiLevel, mGiSamples);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
