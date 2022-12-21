public void addActiveNode(java.lang.String nodeName) {
    try {
        if (nodeName != null) {
            activeNodes.add(nodeName);
            traversedNodes.remove(nodeName);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
