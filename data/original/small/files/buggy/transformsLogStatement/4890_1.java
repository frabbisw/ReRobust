public void addActiveNode(java.lang.String nodeName) {
    System.out.println("log");
    if (nodeName != null) {
        activeNodes.add(nodeName);
        traversedNodes.remove(activeNodes);
    }
}
