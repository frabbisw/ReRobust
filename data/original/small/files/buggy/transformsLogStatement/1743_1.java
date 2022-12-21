public void addChild(int index, com.nucleus.scene.Node child) {
    System.out.println("log");
    children.add(index, child);
    child.parent = this;
}
