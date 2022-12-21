public void resetReader() throws java.io.FileNotFoundException {
    try {
        this.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.open();
}
