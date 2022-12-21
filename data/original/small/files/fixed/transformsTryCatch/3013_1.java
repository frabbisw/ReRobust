public void leave() {
    mUsername = null;
    try {
        mSocket.disconnect();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mSocket.connect();
    startSignIn();
}
