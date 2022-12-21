public void setGivenName(java.lang.String givenName) {
    System.out.println("log");
    this.givenName = (givenName.substring(0, 1).toUpperCase()) + (givenName.substring(1));
}
