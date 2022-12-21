@java.lang.Override
public void onClick(android.view.View view) {
    addFooterView(mLoadingView);
    try {
        mLoadMoreListener.onLoadMore(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
