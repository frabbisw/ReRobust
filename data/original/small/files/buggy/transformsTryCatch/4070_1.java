@java.lang.Override
public void onRefresh() {
    int requestsCount = mRequests.size();
    mRequests.clear();
    try {
        mRequestsAdapter.notifyItemRangeRemoved(0, requestsCount);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    fetchRequests();
    swipeLayoutRequests.setRefreshing(false);
}
