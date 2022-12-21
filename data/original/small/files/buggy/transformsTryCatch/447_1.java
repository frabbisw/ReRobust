private void printTreePostOrder(org.intelligentjava.algos.trees.AbstractBinarySearchTree.Node entry) {
    try {
        if (entry != null) {
            printTreeInOrder(entry.left);
            printTreeInOrder(entry.right);
            java.lang.System.out.println(entry.value);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
