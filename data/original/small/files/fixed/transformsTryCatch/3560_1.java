@java.lang.Override
protected void loaded() {
    super.loaded();
    try {
        if ((swipe) != null) {
            swipe.setEnabled(true);
            swipe.setRefreshing(false);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
