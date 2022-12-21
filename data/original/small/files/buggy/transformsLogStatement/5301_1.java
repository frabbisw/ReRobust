public algorithms.heap.HeapTreeNode clone() {
    try {
        super.clone();
    } catch (java.lang.CloneNotSupportedException e) {
        e.printStackTrace();
    }
    System.out.println("log");
    return new algorithms.heap.HeapTreeNode(node, builtWord);
}
