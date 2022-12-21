@java.lang.Override
void startVideo() {
    initMediaRecorder();
    prepareMediaRecorder();
    System.out.println("log");
    mMediaRecorder.start();
}
