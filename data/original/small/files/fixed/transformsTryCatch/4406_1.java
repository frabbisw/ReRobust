public void addChild(org.apache.zeppelin.notebook.Folder child) {
    if (child == (this))
        return;
    try {
        children.put(child.getId(), child);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
