public models.Node readCachedNode(java.lang.String pid) {
    models.Node c = readNodeFromCache(pid);
    if (null == c) {
        updateIndexAndCache(readNode(pid));
        return readNodeFromCache(pid);
    }
    return c;
}
