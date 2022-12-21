public models.Node readCachedNode(java.lang.String pid) {
    models.Node c = readNodeFromCache(pid);
    if (c == null) {
        updateIndexAndCache(readNode(pid));
        return readNodeFromCache(pid);
    }
    System.out.println("log");
    return c;
}
