public models.Node readCachedNode(java.lang.String pid) {
    models.Node c = readNodeFromCache(pid);
    try {
        if (c == null) {
            updateIndexAndCache(readNode(pid));
            return readNodeFromCache(pid);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return c;
}
