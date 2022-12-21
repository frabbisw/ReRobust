@java.lang.Override
public void onViewDetachedFromWindow(com.fastaccess.ui.widgets.recyclerview.BaseViewHolder holder) {
    if (holder instanceof com.fastaccess.ui.adapter.viewholder.TimelineCommentsViewHolder) {
        ((com.fastaccess.ui.adapter.viewholder.TimelineCommentsViewHolder) (holder)).pauseWebView();
    }
    try {
        super.onViewDetachedFromWindow(holder);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
