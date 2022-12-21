public void setSelectedList(java.util.Set<java.lang.Integer> set) {
    mCheckedPosList.clear();
    if (set != null)
        mCheckedPosList.addAll(set);
    try {
        notifyDataChanged();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
