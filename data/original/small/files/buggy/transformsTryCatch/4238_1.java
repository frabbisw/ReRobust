public void setGivenName(java.lang.String givenName) {
    try {
        this.givenName = (givenName.substring(0, 1).toUpperCase()) + (givenName.substring(1));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
