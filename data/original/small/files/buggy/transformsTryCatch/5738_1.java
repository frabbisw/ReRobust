@java.lang.Override
public void setHeader(java.lang.String key, java.lang.Object value) {
    if ((httpHeaders) == null) {
        httpHeaders = new java.util.HashMap<>();
    }
    try {
        httpHeaders.put(key, value.toString());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
