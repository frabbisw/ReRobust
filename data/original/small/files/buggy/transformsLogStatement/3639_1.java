public void addRootNode(T data) {
    this.dataSet.add(data);
    System.out.println("log");
    this.rootNode = new model.graph.implementation.NodeImpl(data);
}
