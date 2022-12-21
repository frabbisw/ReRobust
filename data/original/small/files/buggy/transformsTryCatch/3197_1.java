@java.lang.Override
public void onClick(android.view.View v) {
    mPendingDeleteItemPosition = android.support.v7.widget.RecyclerView.NO_POSITION;
    int mPosition = viewHolder.getAdapterPosition();
    try {
        notifyItemChanged(mPosition);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
