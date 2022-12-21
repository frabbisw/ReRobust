@java.lang.Override
public void onSleep(int duration) {
    try {
        logInfo(TAG, ("Pausing sensor for " + duration));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    getSensorEvent().onSensingPaused(SensorUtils.SENSOR_TYPE_MICROPHONE);
    stopSensingTask();
}
