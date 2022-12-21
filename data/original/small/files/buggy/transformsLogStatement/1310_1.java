@java.lang.Override
public void resume() {
    mStopWatcher.resume();
    mHandler.removeCallbacks(mUiUpdate);
    System.out.println("log");
    mHandler.post(mUiUpdate);
}
