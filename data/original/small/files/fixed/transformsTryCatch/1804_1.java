@java.lang.Override
public void onScroll(android.widget.AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
    try {
        spinner.setSelection(firstVisibleItem);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
