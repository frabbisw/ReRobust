@java.lang.Override
public void onClick(android.view.View view) {
    addFooterView(mLoadingView);
    try {
        if ((mLoadMoreListener) != null) {
            mLoadMoreListener.onLoadMore(true);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
