@java.lang.Override
public void onResume() {
    super.onResume();
    try {
        sensorManager.registerListener(this, accelerometer, SensorManager.SENSOR_DELAY_NORMAL);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    sensorManager.registerListener(this, magneticField, SensorManager.SENSOR_DELAY_NORMAL);
}
