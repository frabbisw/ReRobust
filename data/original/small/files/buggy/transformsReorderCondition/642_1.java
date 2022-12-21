public void postOrderTraversal(Node n) {
    if (null == n) {
        return;
    }
    inOrderTraversal(n.getLeftChild());
    inOrderTraversal(n.getRightChild());
    java.lang.System.out.println(n.getData());
}
