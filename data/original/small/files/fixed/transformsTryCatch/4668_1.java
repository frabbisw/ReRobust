@java.lang.Override
public void info(java.lang.String s) {
    try {
        if ((underlyingLogger) == null) {
            java.lang.System.out.println(s);
        } else {
            underlyingLogger.info(s);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
