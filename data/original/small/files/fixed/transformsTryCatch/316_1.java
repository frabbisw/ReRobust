private void doLogout() {
    try {
        if ((currentUser) != null) {
            java.lang.System.out.println(((currentUser.getUsername()) + " has been logged out"));
            currentUser = null;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
