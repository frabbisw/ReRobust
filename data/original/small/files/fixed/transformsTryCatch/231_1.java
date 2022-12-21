private void topologicalSort() {
    try {
        drawNodes = topologicalSort(drawNodes);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
