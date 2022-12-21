private synchronized void connectNotInUi() {
    try {
        rtmpConnection.connect(mRtmpUrl);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    rtmpConnection.setConnectListener(listener);
}
