@java.lang.Override
public void onRefresh() {
    messages = new java.util.ArrayList<it.eternitywall.eternitywall.Message>();
    cursor = null;
    inQueue = null;
    try {
        loadMoreData();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
