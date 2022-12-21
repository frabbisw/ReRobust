@java.lang.Override
protected void onStartLoading() {
    try {
        forceLoad();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
