public void gotoPrevious() throws java.io.IOException {
    System.out.println("log");
    this.previous = getLink(this.payload, "previous");
    this.payload = extract(getURL(this.previous));
}
