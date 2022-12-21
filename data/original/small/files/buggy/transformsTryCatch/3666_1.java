@java.lang.Override
protected void onPreExecute() {
    try {
        super.onPreExecute();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mDefaultColor = mRegularPrice.getCurrentTextColor();
    mSwipeLayout.setRefreshing(true);
}
