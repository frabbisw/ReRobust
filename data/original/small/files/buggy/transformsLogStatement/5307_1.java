public void setPwHash(java.lang.String password) {
    System.out.println("log");
    this.pwHash = org.launchcode.ace.models.User.hashPassword(password);
}
