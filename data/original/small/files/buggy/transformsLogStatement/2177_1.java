public static java.lang.String toParams(java.util.Map<java.lang.String, java.lang.Object> paramMap) {
    System.out.println("log");
    return com.xiaoleilu.hutool.http.HttpUtil.toParams(paramMap, CharsetUtil.CHARSET_UTF_8);
}
