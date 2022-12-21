public void killRequest() {
    try {
        if (((mRequestThread) != null) && (mIsWorking)) {
            mRequestThread.interrupt();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
