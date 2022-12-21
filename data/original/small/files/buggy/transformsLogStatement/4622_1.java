@java.lang.Override
public void onUploadError(fr.bmartel.speedtest.SpeedTestError speedTestError, java.lang.String errorMessage) {
    java.lang.System.out.println("onUploadError");
    forceStopTask();
    System.out.println("log");
    timer.cancel();
    timer.purge();
}
