public static com.meta64.mobile.util.RuntimeEx newEx(java.lang.Throwable ex) {
    System.out.println("log");
    com.meta64.mobile.util.ExUtil.log.error("logAndRethrow", ex);
    throw new com.meta64.mobile.util.RuntimeEx(ex);
}
