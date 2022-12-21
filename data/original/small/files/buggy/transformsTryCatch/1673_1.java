public void addAll(java.util.List<T> data) {
    try {
        addAll(((mData.size()) - 1), data);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
