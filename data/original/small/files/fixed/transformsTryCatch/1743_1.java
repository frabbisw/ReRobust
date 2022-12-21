public void addChild(com.nucleus.scene.Node child) {
    try {
        children.add(child);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    child.parent = this;
}
