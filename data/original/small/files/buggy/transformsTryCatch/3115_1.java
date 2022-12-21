@java.lang.Override
public void onRefresh() {
    android.util.Log.d(name.parker.alon.viewerforgithub.view.InfoActivity.LOG_TAG, "PullToRefresh");
    swipeLayout.setRefreshing(false);
    try {
        loadData(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
