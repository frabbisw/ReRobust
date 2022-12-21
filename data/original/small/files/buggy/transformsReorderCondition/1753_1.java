@java.lang.Override
public void iconTextViewOnClick(android.support.v7.widget.RecyclerView.ViewHolder v, int position) {
    if (0 == position)
        stopAnimation(v, R.drawable.power_disable_icon);
    else
        stopAnimation(v, R.drawable.power_enable_icon);
}
