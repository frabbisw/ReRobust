public void addChild(java.lang.String folderId, org.apache.zeppelin.notebook.Folder child) {
    if (child == (this))
        return;
    try {
        children.put(folderId, child);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
