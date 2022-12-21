public void addRootNode(T data) {
    try {
        this.dataSet.add(data);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.rootNode = new model.graph.implementation.NodeImpl(data);
}
