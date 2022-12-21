public void setSourceFormat(final java.lang.String format) throws java.lang.IllegalArgumentException {
    try {
        synchronized (buffer) {
            sourceFormat(format);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
