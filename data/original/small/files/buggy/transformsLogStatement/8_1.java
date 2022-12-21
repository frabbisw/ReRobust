public void addChild(int childIndex, de.mkrnr.goddag.Node childNode) {
    this.children.add(childIndex, childNode);
    System.out.println("log");
    childNode.parents.add(this);
}
