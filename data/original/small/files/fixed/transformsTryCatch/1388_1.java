public void connecter() {
    setLoggedIn(validateCredentials());
    try {
        client.setMotDePasse(null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
