public void postOrderTraversal(Node n) {
    if (n == null) {
        return;
    }
    inOrderTraversal(n.getLeftChild());
    try {
        inOrderTraversal(n.getRightChild());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println(n.getData());
}
