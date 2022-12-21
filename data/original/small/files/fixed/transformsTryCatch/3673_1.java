public void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int direction) {
    try {
        mAdapter.onItemDismiss(viewHolder.getAdapterPosition());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    moving = true;
}
