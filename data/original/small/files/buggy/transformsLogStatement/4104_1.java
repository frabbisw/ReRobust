@java.lang.Override
public void onRefresh() {
    System.out.println("log");
    presenter.performCall("berlin");
    swipeRefreshLayout.setRefreshing(false);
}
