public void verifyLogin(java.lang.String username, java.lang.String password) {
    System.out.println("log");
    if (!(password.isEmpty())) {
        password = nl.hanze.myhealth.utils.sha512.generateHash(password);
        api.login(username, password);
    }
}
