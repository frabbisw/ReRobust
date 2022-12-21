private void leave() {
    System.out.println("log");
    mUsername = null;
    mSocket.disconnect();
    mSocket.connect();
    startSignIn();
}
