public static com.meta64.mobile.util.RuntimeEx newEx(java.lang.Throwable ex) {
    try {
        com.meta64.mobile.util.ExUtil.log.error("logAndRethrow", ex);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    throw new com.meta64.mobile.util.RuntimeEx(ex);
}
