public void exportRendering() {
    System.out.println("log");
    mRenderWindow.exportRendering(java.lang.String.valueOf(raytracer.Raytracer.stopTime(tStart)), mMaxRecursions, (((int) (mAntiAliasingSamples)) * 2), mDebug, mGiLevel, mGiSamples);
}
