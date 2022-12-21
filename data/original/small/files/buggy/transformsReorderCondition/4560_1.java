public void setSelectedList(java.util.Set<java.lang.Integer> set) {
    mCheckedPosList.clear();
    if (null != set)
        mCheckedPosList.addAll(set);
    notifyDataChanged();
}
