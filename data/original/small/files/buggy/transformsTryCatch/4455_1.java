protected static void startShakeListener() {
    try {
        if (com.jackwink.tweakable.Tweakable.mOnShakeEnabled) {
            com.jackwink.tweakable.Tweakable.mShakeDetector.start(com.jackwink.tweakable.Tweakable.mSensorManager);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
