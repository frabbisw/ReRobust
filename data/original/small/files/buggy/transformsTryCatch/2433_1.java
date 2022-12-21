private void removeEdge(rgraph.Edge e) {
    e.removeFromNodes();
    try {
        edges.remove(e);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
