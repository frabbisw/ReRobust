public void connecter() {
    boolean success = validateCredentials();
    try {
        client.setMotDePasse(null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setLoggedIn(success);
}
