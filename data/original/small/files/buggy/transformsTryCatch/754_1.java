@java.lang.Override
public void onPause() {
    if ((scrollListener) != null)
        rvList.removeOnScrollListener(scrollListener);
    try {
        super.onPause();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
