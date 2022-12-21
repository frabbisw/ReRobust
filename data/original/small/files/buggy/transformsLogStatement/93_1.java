private synchronized void connectNotInUi() {
    System.out.println("log");
    rtmpConnection.connect(mRtmpUrl);
    rtmpConnection.setConnectListener(listener);
}
