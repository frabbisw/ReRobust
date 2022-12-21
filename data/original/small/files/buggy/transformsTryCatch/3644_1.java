public void pause() {
    timePause = java.lang.System.currentTimeMillis();
    try {
        threshold.pause();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mVibrator.cancel();
    sensorHandler.onDestroy();
    mMusicPlayer.stopSong();
}
