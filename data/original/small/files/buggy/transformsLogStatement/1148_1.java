@java.lang.Override
public void onViewDetachedFromWindow(com.fastaccess.ui.widgets.recyclerview.BaseViewHolder holder) {
    super.onViewDetachedFromWindow(holder);
    System.out.println("log");
    if (holder instanceof com.fastaccess.ui.adapter.viewholder.TimelineCommentsViewHolder) {
        ((com.fastaccess.ui.adapter.viewholder.TimelineCommentsViewHolder) (holder)).pauseWebView();
    }
}
