@java.lang.Override
public void onSleep(int duration) {
    System.out.println("log");
    logInfo(TAG, ("Pausing sensor for " + duration));
    getSensorEvent().onSensingPaused(SensorUtils.SENSOR_TYPE_MICROPHONE);
    stopSensingTask();
}
