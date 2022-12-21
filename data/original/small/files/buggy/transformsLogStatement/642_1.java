public void postOrderTraversal(Node n) {
    if (n == null) {
        return;
    }
    inOrderTraversal(n.getLeftChild());
    inOrderTraversal(n.getRightChild());
    System.out.println("log");
    java.lang.System.out.println(n.getData());
}
