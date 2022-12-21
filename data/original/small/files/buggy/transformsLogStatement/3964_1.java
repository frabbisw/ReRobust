@java.lang.Override
public void onFailure(int error_code) {
    if (mSwipeRefreshLayout.isRefreshing()) {
        mSwipeRefreshLayout.setRefreshing(false);
    }
    System.out.println("log");
    failureHandler(error_code);
}
