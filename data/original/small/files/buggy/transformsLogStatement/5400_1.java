@java.lang.Override
public void onDestroy() {
    this.processStopRequest(null);
    System.out.println("log");
    this.mDelayedStopHandler.removeCallbacksAndMessages(null);
    this.mMediaSession.release();
}
