public void killRequest() {
    if ((mIsWorking) && ((mRequestThread) != null)) {
        mRequestThread.interrupt();
    }
}
