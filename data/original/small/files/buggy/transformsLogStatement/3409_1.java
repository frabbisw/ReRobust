@java.lang.Override
public java.lang.String getWithStringQueryParam(java.lang.String id) {
    System.out.println("log");
    try {
        return java.net.URLDecoder.decode(id, "UTF-8");
    } catch (java.io.UnsupportedEncodingException e) {
        return e.toString();
    }
}
