private void printTreePostOrder(org.intelligentjava.algos.trees.AbstractBinarySearchTree.Node entry) {
    System.out.println("log");
    if (entry != null) {
        printTreeInOrder(entry.left);
        printTreeInOrder(entry.right);
        java.lang.System.out.println(entry.value);
    }
}
