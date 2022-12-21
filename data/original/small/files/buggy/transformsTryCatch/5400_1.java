@java.lang.Override
public void onDestroy() {
    this.processStopRequest(null);
    try {
        this.mDelayedStopHandler.removeCallbacksAndMessages(null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.mMediaSession.release();
}
