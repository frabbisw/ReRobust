public void addChild(java.lang.String folderId, org.apache.zeppelin.notebook.Folder child) {
    if ((this) == child)
        return;
    children.put(folderId, child);
}
