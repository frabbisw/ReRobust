@java.lang.Deprecated
public void setSelectedList(java.util.Set<java.lang.Integer> set) {
    try {
        mCheckedPosList.clear();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (set != null) {
        mCheckedPosList.addAll(set);
    }
    notifyDataChanged();
}
