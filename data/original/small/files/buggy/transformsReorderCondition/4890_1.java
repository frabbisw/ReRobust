public void addActiveNode(java.lang.String nodeName) {
    if (null != nodeName) {
        activeNodes.add(nodeName);
        traversedNodes.remove(activeNodes);
    }
}
