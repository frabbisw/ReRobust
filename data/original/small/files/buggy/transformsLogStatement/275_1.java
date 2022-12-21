public int getNchannels() {
    System.out.println("log");
    return hasDimensions() ? 0 : this.dimensions[4];
}
