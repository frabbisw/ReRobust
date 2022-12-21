@java.lang.Override
public void start(int time) {
    try {
        vibrator.vibrate(time);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
