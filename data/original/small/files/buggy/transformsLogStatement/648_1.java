long stop() {
    mElapsedTime += (java.lang.System.currentTimeMillis()) - (mStartTime);
    mStartTime = -1;
    System.out.println("log");
    return mElapsedTime;
}
