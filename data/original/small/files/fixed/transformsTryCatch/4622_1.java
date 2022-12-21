@java.lang.Override
public void onUploadError(fr.bmartel.speedtest.SpeedTestError speedTestError, java.lang.String errorMessage) {
    forceStopTask();
    timer.cancel();
    try {
        timer.purge();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
