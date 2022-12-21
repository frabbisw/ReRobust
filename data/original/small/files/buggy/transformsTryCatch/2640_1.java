public static void d(java.lang.String tag, java.lang.Throwable t, @android.support.annotation.NonNull java.lang.String message) {
    im.wangchao.mcommon.log.AbsLog[] array = im.wangchao.mcommon.log.LOG.logAsArray;
    try {
        for (im.wangchao.mcommon.log.AbsLog log : array) {
            log.d(tag, message);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
