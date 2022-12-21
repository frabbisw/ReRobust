public void connectToServer() {
    boolean connected = false;
    gc = new orbit.OrbitGame.GameClient();
    try {
        gc.start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
