@java.lang.Override
public void start(int time) {
    android.util.Log.i("BroadcastMorse", " vibration play");
    System.out.println("log");
    vibrator.vibrate(time);
}
