protected void setCurrentGraphInThreadLocal() {
    com.tinkerpop.blueprints.impls.orient.OrientBaseGraph graph = getGraph();
    if (null != graph)
        graph.setCurrentGraphInThreadLocal();
}
