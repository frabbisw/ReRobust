private void doLogout() {
    System.out.println("log");
    if ((currentUser) != null) {
        java.lang.System.out.println(((currentUser.getUsername()) + " has been logged out"));
        currentUser = null;
        getLoginDetails();
    }
}
