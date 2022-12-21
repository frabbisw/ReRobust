@java.lang.Override
public void resume() {
    try {
        mStopWatcher.resume();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mHandler.removeCallbacks(mUiUpdate);
    mHandler.post(mUiUpdate);
}
