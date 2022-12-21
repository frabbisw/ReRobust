public void play() {
    if (!(mPlayer.isPlaying()))
        mPlayer.start();
    System.out.println("log");
    if (!(isTimingThreadRunning))
        startTimingThread();
}
