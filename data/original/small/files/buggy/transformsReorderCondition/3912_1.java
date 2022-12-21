public void exportRendering() {
    mRenderWindow.exportRendering(java.lang.String.valueOf(raytracer.Raytracer.stopTime(tStart)), mMaxRecursions, (2 * ((int) (mAntiAliasingSamples))), mDebug, mGiLevel, mGiSamples);
}
