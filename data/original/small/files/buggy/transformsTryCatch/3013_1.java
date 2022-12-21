private void leave() {
    mUsername = null;
    mSocket.disconnect();
    mSocket.connect();
    try {
        startSignIn();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
