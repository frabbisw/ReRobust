private void removeEdge(rgraph.Edge e) {
    if (e == null) {
        return;
    }
    e.removeFromNodes();
    try {
        edges.remove(e);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
