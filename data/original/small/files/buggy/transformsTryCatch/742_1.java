public void insert(T node) {
    nodes.add(heapSize, node);
    try {
        heapifyUp(heapSize);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    (heapSize)++;
}
