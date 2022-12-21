public void removeFirstItem() {
    try {
        mAllDatas.remove(0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.rsen.base.RBaseAdapter.notifyItemRemoved(0);
}
