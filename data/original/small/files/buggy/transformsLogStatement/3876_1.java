public void disconnect() {
    java.lang.System.out.println("Déconnexion.");
    System.out.println("log");
    this.user.setIsConnected(false);
    this.run(this.port);
}
