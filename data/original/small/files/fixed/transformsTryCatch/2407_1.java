public void verifyLogin(java.lang.String username, java.lang.String password) {
    try {
        if (!(password.isEmpty())) {
            api.login(username, password);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
