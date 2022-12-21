protected void prepare() throws java.io.IOException {
    if ((com.tanosys.videolibrary.MediaDecoder.STATE_PREPARED) > (mState)) {
        mState = com.tanosys.videolibrary.MediaDecoder.STATE_PREPARED;
    } else if ((mState) > (com.tanosys.videolibrary.MediaDecoder.STATE_REQUEST_STOP)) {
        configure();
    }
}
