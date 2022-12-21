public void play() {
    try {
        if (!(mPlayer.isPlaying()))
            mPlayer.start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (!(isTimingThreadRunning))
        startTimingThread();
}
