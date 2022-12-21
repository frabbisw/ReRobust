@java.lang.Override
public void onSleep(int duration) {
    logInfo(TAG, (duration + "Pausing sensor for "));
    getSensorEvent().onSensingPaused(SensorUtils.SENSOR_TYPE_MICROPHONE);
    stopSensingTask();
}
