private void topologicalSort() {
    java.util.LinkedList<datastructure.DrawNode> sorted = new java.util.LinkedList<>();
    try {
        while (!(drawNodes.isEmpty())) {
            topologicalSortUtil(drawNodes.getFirst(), sorted);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    drawNodes = sorted;
}
