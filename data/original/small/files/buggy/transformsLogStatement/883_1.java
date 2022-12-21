public void release() {
    stop();
    System.out.println("log");
    mRecorder.release();
    started = false;
}
