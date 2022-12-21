public void startRecord(java.lang.String recPath) {
    try {
        if ((mMp4Muxer) != null) {
            mMp4Muxer.record(new java.io.File(recPath));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
