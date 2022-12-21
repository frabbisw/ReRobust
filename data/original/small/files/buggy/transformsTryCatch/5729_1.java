private synchronized void stop() {
    try {
        com.princecoder.nanodegree.spotifytreamer.utils.L.m(LOG_TAG, "stop");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (isPrepared) {
        isPrepared = false;
        mp.stop();
        StopProgressBar();
    }
}
