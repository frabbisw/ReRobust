public void connecter() {
    boolean success = validateCredentials();
    System.out.println("log");
    client.setMotDePasse(null);
    setLoggedIn(success);
}
