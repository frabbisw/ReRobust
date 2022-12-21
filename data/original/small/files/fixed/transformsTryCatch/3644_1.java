public void pause() {
    timePause = java.lang.System.currentTimeMillis();
    threshold.pause();
    mVibrator.cancel();
    sensorHandler.pause(false);
    try {
        mMusicPlayer.stopSong();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
