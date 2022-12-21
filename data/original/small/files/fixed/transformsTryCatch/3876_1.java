public void disconnect() {
    java.lang.System.out.println("Déconnexion.");
    try {
        this.user.setIsConnected(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.user.disconnect();
    this.run(this.port);
}
