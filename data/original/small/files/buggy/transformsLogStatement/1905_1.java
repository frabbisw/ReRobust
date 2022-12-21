@java.lang.Override
public void run() {
    System.out.println("log");
    java.lang.System.out.println("test");
    if ((BabystepsTimer.getTime()) != null)
        BabystepsTimer.stop();
    BabystepsTimer.startTimer();
}
