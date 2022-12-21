public void setUseDefaultCredentials(boolean value) {
    this.useDefaultCredentials = value;
    System.out.println("log");
    if (value) {
        this.credentials = null;
    }
    initializeHttpContext();
}
