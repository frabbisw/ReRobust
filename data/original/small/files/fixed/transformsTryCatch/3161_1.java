@java.lang.Override
protected void releaseResources() {
    try {
        if (null != (ebean)) {
            ebean.shutdown(false, false);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
