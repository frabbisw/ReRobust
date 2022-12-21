@java.lang.Override
public void run() {
    startLiveData();
    try {
        buttonStartStop.setBackgroundResource(R.drawable.stop_68);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    isRunning = true;
}
