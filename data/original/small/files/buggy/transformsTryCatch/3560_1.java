@java.lang.Override
protected void loaded() {
    try {
        super.loaded();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    swipe.setEnabled(true);
    swipe.setRefreshing(false);
}
