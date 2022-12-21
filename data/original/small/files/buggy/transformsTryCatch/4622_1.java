@java.lang.Override
public void onUploadError(fr.bmartel.speedtest.SpeedTestError speedTestError, java.lang.String errorMessage) {
    java.lang.System.out.println("onUploadError");
    forceStopTask();
    timer.cancel();
    try {
        timer.purge();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
