public void setHeader(java.lang.String header, java.lang.String value) {
    if (null == (headers))
        headers = new java.util.HashMap<java.lang.String, java.lang.String>();
    try {
        headers.put(header, value);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
