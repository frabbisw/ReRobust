public void pause() {
    timePause = java.lang.System.currentTimeMillis();
    threshold.pause();
    mVibrator.cancel();
    System.out.println("log");
    sensorHandler.onDestroy();
    mMusicPlayer.stopSong();
}
