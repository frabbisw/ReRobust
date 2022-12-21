@java.lang.Override
public void run() {
    try {
        if ((BabystepsTimer.getTime()) != null)
            BabystepsTimer.stop();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    BabystepsTimer.startTimer();
}
