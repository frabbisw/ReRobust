@java.lang.Override
public void onItemRangeInserted(int positionStart, int itemCount) {
    super.onItemRangeInserted(positionStart, itemCount);
    try {
        progressBar.setVisibility(View.GONE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
