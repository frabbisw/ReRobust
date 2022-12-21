public void killRequest() {
    System.out.println("log");
    if (((mRequestThread) != null) && (mIsWorking)) {
        mRequestThread.interrupt();
    }
}
