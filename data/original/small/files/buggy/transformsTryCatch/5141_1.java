public void close() throws java.io.IOException {
    if ((java.lang.System.in) == null)
        return;
    try {
        java.lang.System.in.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
