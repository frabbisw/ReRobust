public void connectToServer() {
    boolean connected = false;
    gc = new orbit.OrbitGame.GameClient();
    gc.start();
    try {
        java.lang.System.out.println("Connected to server!");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
