@java.lang.Override
protected void releaseResources() {
    try {
        ebean.shutdown(false, false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
