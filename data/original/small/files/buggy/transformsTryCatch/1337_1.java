private void insert(Node<V> node) {
    if ((root) == null) {
        root = node;
    }
    try {
        insertCase1(node);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
