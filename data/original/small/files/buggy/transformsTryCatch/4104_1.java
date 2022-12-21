@java.lang.Override
public void onRefresh() {
    presenter.performCall("berlin");
    try {
        swipeRefreshLayout.setRefreshing(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
