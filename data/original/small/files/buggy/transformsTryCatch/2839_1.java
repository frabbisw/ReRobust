public void setHeader(java.lang.String header, java.lang.String value) {
    try {
        headers.put(header, value);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
