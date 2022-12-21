public void WriteExpandingNodeToFile(Node ExpandingNode) {
    try {
        for (Leaf leafToWrite : ExpandingNode.getNodeLeaves()) {
            leafToWrite.WriteEachLeaf();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
