public void startRecord(java.lang.String recPath) {
    if (null != (mMp4Muxer)) {
        mMp4Muxer.record(new java.io.File(recPath));
    }
}
