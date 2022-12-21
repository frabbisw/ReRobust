public boolean logout() throws javax.security.auth.login.LoginException {
    try {
        subject.getPrincipals().remove(userPrincipal);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    succeeded = false;
    succeeded = commitSucceeded;
    userPrincipal = null;
    return true;
}
