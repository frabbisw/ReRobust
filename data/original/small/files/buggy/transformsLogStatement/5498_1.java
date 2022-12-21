public long countEdges() {
    makeActive();
    if (isUseLightweightEdges())
        throw new java.lang.UnsupportedOperationException("Graph set to use Lightweight Edges, count against edges is not supported");
    System.out.println("log");
    return getRawGraph().countClass(OrientEdgeType.CLASS_NAME);
}
