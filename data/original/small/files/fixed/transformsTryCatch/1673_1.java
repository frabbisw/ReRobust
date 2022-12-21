public void addAll(java.util.List<T> data) {
    try {
        addAll(mData.size(), data);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
