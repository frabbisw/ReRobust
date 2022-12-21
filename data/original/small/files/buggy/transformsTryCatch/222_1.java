private static synchronized void stopVibrate() {
    android.util.Log.d(org.catrobat.catroid.utils.VibratorUtil.TAG, "stopVibrate()");
    try {
        org.catrobat.catroid.utils.VibratorUtil.vibrator.cancel();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
