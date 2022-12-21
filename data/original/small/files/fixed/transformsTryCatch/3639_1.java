public void addRootNode(T data) {
    try {
        dataSet.add(data);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    rootNode = new model.graph.implementation.NodeImpl(data);
}
