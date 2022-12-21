@java.lang.Override
public void onItemRangeInserted(int positionStart, int itemCount) {
    try {
        super.onItemRangeInserted(positionStart, itemCount);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (progressBar != null)
        progressBar.setVisibility(View.GONE);
}
