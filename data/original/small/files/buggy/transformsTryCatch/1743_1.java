public void addChild(int index, com.nucleus.scene.Node child) {
    try {
        children.add(index, child);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    child.parent = this;
}
