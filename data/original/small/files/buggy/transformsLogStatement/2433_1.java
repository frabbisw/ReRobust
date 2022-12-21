private void removeEdge(rgraph.Edge e) {
    e.removeFromNodes();
    System.out.println("log");
    edges.remove(e);
}
