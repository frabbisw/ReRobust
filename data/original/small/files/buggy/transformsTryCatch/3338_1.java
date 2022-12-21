@java.lang.Override
public void afterPropertiesSet() throws java.lang.Exception {
    try {
        setSegmentStatus();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    modifyCodeUsage();
}
