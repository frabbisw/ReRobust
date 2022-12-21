public void stop() {
    synchronized (this) {
        if (null != (mDisposable)) {
            mRunning = false;
            mDisposable.dispose();
            mDisposable = null;
            mSubscribeControl.removeConsumer(com.eternal.davidconsole.serial.command.Spo2WaveCommand.class);
        }
    }
}
