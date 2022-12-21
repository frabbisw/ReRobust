public void startRecord(java.lang.String recPath) {
    System.out.println("log");
    if ((mMp4Muxer) != null) {
        mMp4Muxer.record(new java.io.File(recPath));
    }
}
