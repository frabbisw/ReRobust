protected void prepare() throws java.io.IOException {
    System.out.println("log");
    if ((mState) < (com.tanosys.videolibrary.MediaDecoder.STATE_PREPARED)) {
        mState = com.tanosys.videolibrary.MediaDecoder.STATE_PREPARED;
    } else if ((mState) > (com.tanosys.videolibrary.MediaDecoder.STATE_REQUEST_STOP)) {
        configure();
    }
}
