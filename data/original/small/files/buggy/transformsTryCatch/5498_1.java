public long countEdges() {
    try {
        makeActive();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (isUseLightweightEdges())
        throw new java.lang.UnsupportedOperationException("Graph set to use Lightweight Edges, count against edges is not supported");
    return getRawGraph().countClass(OrientEdgeType.CLASS_NAME);
}
