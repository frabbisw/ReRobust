@java.lang.Override
public void info(java.lang.String s) {
    if (null == (underlyingLogger)) {
        java.lang.System.out.println(s);
    }
    underlyingLogger.info(s);
}
