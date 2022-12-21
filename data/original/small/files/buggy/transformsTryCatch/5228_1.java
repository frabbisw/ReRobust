protected void newLine() throws java.io.IOException {
    try {
        tab(out, 0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
