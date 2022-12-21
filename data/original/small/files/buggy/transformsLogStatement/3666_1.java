@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    mDefaultColor = mRegularPrice.getCurrentTextColor();
    System.out.println("log");
    mSwipeLayout.setRefreshing(true);
}
