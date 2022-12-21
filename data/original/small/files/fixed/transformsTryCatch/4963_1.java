public void gotoPrevious(java.lang.String previous) throws java.io.IOException {
    try {
        this.payload = extract(getURL(previous));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
