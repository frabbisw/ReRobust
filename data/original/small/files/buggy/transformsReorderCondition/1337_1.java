private void insert(Node<V> node) {
    if (null == (root)) {
        root = node;
    }
    insertCase1(node);
}
