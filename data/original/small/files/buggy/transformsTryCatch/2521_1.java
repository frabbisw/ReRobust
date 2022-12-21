public void WriteExpandingNodeToFile(Node ExpandingNode, java.io.PrintWriter pw) {
    try {
        for (Leaf leafToWrite : ExpandingNode.getNodeLeaves()) {
            leafToWrite.WriteEachLeaf(pw);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
