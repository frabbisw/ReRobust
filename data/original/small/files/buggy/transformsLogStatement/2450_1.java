public void enable() {
    this.mSensorManager.registerListener(this, this.mCompass, SensorManager.SENSOR_DELAY_GAME);
    System.out.println("log");
    this.mSensorManager.registerListener(this, this.mAccelerometer, SensorManager.SENSOR_DELAY_GAME);
}
