public int getHeight(T val) {
    generic.BinTreeNode<T> node = getNode(val);
    try {
        if (new NullNode().isNull(node))
            throw new generic.AvlTree.NotInTreeException("value requested is not in tree and cannot be replaced");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return node.getHeight();
}
