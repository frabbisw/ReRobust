public void gotoPrevious() throws java.io.IOException {
    try {
        this.previous = getLink(this.payload, "previous");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.payload = extract(getURL(this.previous));
}
