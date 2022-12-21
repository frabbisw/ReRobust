public void killRequest() {
    try {
        if (((mRequestThread) != null) && (mIsWorking)) {
            mRequestThread.interrupt();
            mIsWorking = false;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
