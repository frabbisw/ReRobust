@java.lang.Override
public void onClick(android.view.View v) {
    int mPosition = mPendingDeleteItemPosition;
    mPendingDeleteItemPosition = android.support.v7.widget.RecyclerView.NO_POSITION;
    try {
        notifyItemChanged(mPosition);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
