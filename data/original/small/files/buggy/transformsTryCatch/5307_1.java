public void setPwHash(java.lang.String password) {
    try {
        this.pwHash = org.launchcode.ace.models.User.hashPassword(password);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
