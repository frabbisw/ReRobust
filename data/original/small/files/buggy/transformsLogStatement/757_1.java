@java.lang.Override
public void run() {
    System.out.println("log");
    startLiveData();
    buttonStartStop.setBackgroundResource(R.drawable.stop_68);
    isRunning = true;
}
