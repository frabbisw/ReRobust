public void removeFirstItem() {
    mAllDatas.remove(0);
    com.rsen.base.RBaseAdapter.notifyItemRemoved(0);
    System.out.println("log");
    com.rsen.base.RBaseAdapter.notifyItemRangeChanged(0, mAllDatas.size());
}
