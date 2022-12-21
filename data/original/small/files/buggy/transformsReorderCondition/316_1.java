private void doLogout() {
    if (null != (currentUser)) {
        java.lang.System.out.println(((currentUser.getUsername()) + " has been logged out"));
        currentUser = null;
        getLoginDetails();
    }
}
