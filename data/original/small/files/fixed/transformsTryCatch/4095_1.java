public void play() {
    if ((mPlayer) == null)
        return;
    if (!(mPlayer.isPlaying()))
        mPlayer.start();
    try {
        if (!(isTimingThreadRunning))
            startTimingThread();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
