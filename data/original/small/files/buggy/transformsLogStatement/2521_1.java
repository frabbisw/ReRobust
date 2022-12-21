public void WriteExpandingNodeToFile(Node ExpandingNode, java.io.PrintWriter pw) {
    System.out.println("log");
    for (Leaf leafToWrite : ExpandingNode.getNodeLeaves()) {
        leafToWrite.WriteEachLeaf(pw);
    }
}
