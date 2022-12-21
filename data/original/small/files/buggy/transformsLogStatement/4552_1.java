@java.lang.Override
public void onClick(android.view.View view) {
    addFooterView(mLoadingView);
    System.out.println("log");
    mLoadMoreListener.onLoadMore(true);
}
