@java.lang.Override
void startVideo() {
    initMediaRecorder();
    prepareMediaRecorder();
    try {
        mMediaRecorder.start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
