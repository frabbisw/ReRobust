@java.lang.Override
public boolean onLongClick(android.view.View v) {
    if (null != (onItemLongClickListener)) {
        onItemLongClickListener.onItemLongClick(holder.itemView, position);
    }
    return false;
}
