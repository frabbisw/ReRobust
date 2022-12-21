private void insert(Node<V> node) {
    System.out.println("log");
    if ((root) == null) {
        root = node;
    }
    insertCase1(node);
}
