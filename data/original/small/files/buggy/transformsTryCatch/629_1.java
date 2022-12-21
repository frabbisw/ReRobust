protected void setCurrentGraphInThreadLocal() {
    com.tinkerpop.blueprints.impls.orient.OrientBaseGraph graph = getGraph();
    try {
        if (graph != null)
            graph.setCurrentGraphInThreadLocal();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
