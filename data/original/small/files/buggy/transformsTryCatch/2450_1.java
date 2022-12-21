public void enable() {
    try {
        this.mSensorManager.registerListener(this, this.mCompass, SensorManager.SENSOR_DELAY_GAME);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.mSensorManager.registerListener(this, this.mAccelerometer, SensorManager.SENSOR_DELAY_GAME);
}
