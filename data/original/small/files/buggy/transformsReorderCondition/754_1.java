@java.lang.Override
public void onPause() {
    if (null != (scrollListener))
        rvList.removeOnScrollListener(scrollListener);
    super.onPause();
}
