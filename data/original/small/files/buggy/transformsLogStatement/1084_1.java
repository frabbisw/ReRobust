@java.lang.Override
public void onItemRangeInserted(int positionStart, int itemCount) {
    System.out.println("log");
    super.onItemRangeInserted(positionStart, itemCount);
    progressBar.setVisibility(View.GONE);
}
