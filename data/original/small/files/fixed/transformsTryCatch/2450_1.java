public void enable() {
    try {
        this.mSensorManager.registerListener(this, this.mAccelerometer, SensorManager.SENSOR_DELAY_GAME);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
