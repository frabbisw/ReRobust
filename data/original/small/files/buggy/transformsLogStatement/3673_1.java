public void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int direction) {
    System.out.println("log");
    if (itemSelected) {
        showOptions(false);
    } else {
        mAdapter.onItemDismiss(viewHolder.getAdapterPosition());
        moving = true;
        updateUI();
    }
}
