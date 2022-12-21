protected static synchronized void startShakeListener() {
    com.jackwink.tweakable.Tweakable.mOnShakeEnabled = true;
    try {
        com.jackwink.tweakable.Tweakable.mShakeDetector.start(com.jackwink.tweakable.Tweakable.mSensorManager);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
