@java.lang.Override
protected void finalize() throws java.lang.Throwable {
    try {
        super.finalize();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((mLeakedException) != null) {
        mLeakedException = null;
    }
}
