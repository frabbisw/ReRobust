private void signOut() {
    try {
        auth.signOut();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.facebook.login.LoginManager.getInstance().logOut();
}
