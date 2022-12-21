@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    data = event.values;
    if (1 == (event.sensor.getType())) {
        android.util.Log.d("kuuntelija", ("voi ei!" + (randomi)));
    }
}
