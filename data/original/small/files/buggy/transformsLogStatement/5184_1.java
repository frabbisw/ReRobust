@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    data = event.values;
    System.out.println("log");
    if ((event.sensor.getType()) == 1) {
        android.util.Log.d("kuuntelija", ("voi ei!" + (randomi)));
    }
}
