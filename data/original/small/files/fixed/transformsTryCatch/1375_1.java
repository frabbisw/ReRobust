@java.lang.Override
public synchronized void onSleep(int duration) {
    stopSensingTask();
    logInfo(TAG, ("Pausing sensor for " + duration));
    try {
        getSensorEvent().onSensingPaused(SensorUtils.SENSOR_TYPE_MICROPHONE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
