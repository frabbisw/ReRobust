public void signOut() {
    auth.signOut();
    System.out.println("log");
    com.facebook.login.LoginManager.getInstance().logOut();
}
