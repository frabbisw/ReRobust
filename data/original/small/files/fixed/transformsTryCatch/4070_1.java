@java.lang.Override
public void onRefresh() {
    try {
        fetchRequests();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    swipeLayoutRequests.setRefreshing(false);
}
