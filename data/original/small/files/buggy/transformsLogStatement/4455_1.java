protected static void startShakeListener() {
    System.out.println("log");
    if (com.jackwink.tweakable.Tweakable.mOnShakeEnabled) {
        com.jackwink.tweakable.Tweakable.mShakeDetector.start(com.jackwink.tweakable.Tweakable.mSensorManager);
    }
}
