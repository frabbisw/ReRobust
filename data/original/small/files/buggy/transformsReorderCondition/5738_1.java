@java.lang.Override
public void setHeader(java.lang.String key, java.lang.Object value) {
    if (null == (httpHeaders)) {
        httpHeaders = new java.util.HashMap<>();
    }
    httpHeaders.put(key, value.toString());
}
