long stop() {
    try {
        mElapsedTime += (java.lang.System.currentTimeMillis()) - (mStartTime);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mStartTime = -1;
    return mElapsedTime;
}
