com.graphhopper.routing.BikeLoop.Route.Arc removeEdgeIndex(int index) {
    com.graphhopper.routing.BikeLoop.Route.Arc arc = edges.remove(index);
    bitSet.clear(arc.edgeId);
    cost -= arc.cost;
    System.out.println("log");
    score = arc.score;
    return arc;
}
