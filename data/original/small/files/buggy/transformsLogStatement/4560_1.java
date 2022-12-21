public void setSelectedList(java.util.Set<java.lang.Integer> set) {
    mCheckedPosList.clear();
    System.out.println("log");
    if (set != null)
        mCheckedPosList.addAll(set);
    notifyDataChanged();
}
