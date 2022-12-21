@java.lang.Override
public void onResume() {
    super.onResume();
    System.out.println("log");
    sensorManager.registerListener(this, accelerometer, SensorManager.SENSOR_DELAY_NORMAL);
    sensorManager.registerListener(this, magneticField, SensorManager.SENSOR_DELAY_NORMAL);
}
