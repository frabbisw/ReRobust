public void addChild(int childIndex, de.mkrnr.goddag.Node childNode) {
    this.children.add(childIndex, childNode);
    try {
        childNode.parents.add(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
