private static synchronized void stopVibrate() {
    System.out.println("log");
    android.util.Log.d(org.catrobat.catroid.utils.VibratorUtil.TAG, "stopVibrate()");
    org.catrobat.catroid.utils.VibratorUtil.vibrator.cancel();
}
