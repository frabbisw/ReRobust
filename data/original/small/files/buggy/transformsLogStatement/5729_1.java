private synchronized void stop() {
    System.out.println("log");
    com.princecoder.nanodegree.spotifytreamer.utils.L.m(LOG_TAG, "stop");
    if (isPrepared) {
        isPrepared = false;
        mp.stop();
        StopProgressBar();
    }
}
