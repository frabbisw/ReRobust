@java.lang.Override
public void onPause() {
    if ((scrollListener) != null)
        rvList.removeOnScrollListener(scrollListener);
    System.out.println("log");
    super.onPause();
}
