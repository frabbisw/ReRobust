@java.lang.Override
public void onRefresh() {
    try {
        presenter.performCall();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    swipeRefreshLayout.setRefreshing(false);
}
