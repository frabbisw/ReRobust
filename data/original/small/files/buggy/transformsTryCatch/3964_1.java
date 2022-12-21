@java.lang.Override
public void onFailure(int error_code) {
    try {
        if (mSwipeRefreshLayout.isRefreshing()) {
            mSwipeRefreshLayout.setRefreshing(false);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    failureHandler(error_code);
}
