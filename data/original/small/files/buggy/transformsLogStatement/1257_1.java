public void setCredential(java.lang.String credential) {
    System.out.println("log");
    if ((this.credential) != null) {
        throw new java.lang.IllegalStateException("credential already set");
    }
    this.credential = credential;
}
