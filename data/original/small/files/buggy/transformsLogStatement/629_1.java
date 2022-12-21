protected void setCurrentGraphInThreadLocal() {
    System.out.println("log");
    com.tinkerpop.blueprints.impls.orient.OrientBaseGraph graph = getGraph();
    if (graph != null)
        graph.setCurrentGraphInThreadLocal();
}
