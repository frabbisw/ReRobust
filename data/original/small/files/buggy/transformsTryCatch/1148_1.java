@java.lang.Override
public void onViewDetachedFromWindow(com.fastaccess.ui.widgets.recyclerview.BaseViewHolder holder) {
    super.onViewDetachedFromWindow(holder);
    try {
        if (holder instanceof com.fastaccess.ui.adapter.viewholder.TimelineCommentsViewHolder) {
            ((com.fastaccess.ui.adapter.viewholder.TimelineCommentsViewHolder) (holder)).pauseWebView();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
