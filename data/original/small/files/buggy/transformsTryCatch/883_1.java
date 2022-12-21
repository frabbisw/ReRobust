public void release() {
    stop();
    try {
        mRecorder.release();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    started = false;
}
