@java.lang.Override
public void start(int time) {
    try {
        android.util.Log.i("BroadcastMorse", " vibration play");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    vibrator.vibrate(time);
}
