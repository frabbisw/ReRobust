public void setUseDefaultCredentials(boolean value) {
    this.useDefaultCredentials = value;
    if (value) {
        this.credentials = null;
    }
    try {
        initializeHttpContext();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
