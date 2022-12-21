public void verifyLogin(java.lang.String username, java.lang.String password) {
    try {
        if (!(password.isEmpty())) {
            password = nl.hanze.myhealth.utils.sha512.generateHash(password);
            api.login(username, password);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
