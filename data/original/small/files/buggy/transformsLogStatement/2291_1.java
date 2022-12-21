private void ensureClose(java.io.Closeable c) {
    System.out.println("log");
    try {
        c.close();
    } catch (java.io.IOException e) {
    }
}
