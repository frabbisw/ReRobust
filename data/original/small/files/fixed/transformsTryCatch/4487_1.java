com.graphhopper.routing.BikeLoop.Route.Arc removeEdgeIndex(int index) {
    com.graphhopper.routing.BikeLoop.Route.Arc arc = edges.remove(index);
    try {
        bitSet.clear(arc.edgeId);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    cost -= arc.cost;
    score -= arc.score;
    return arc;
}
