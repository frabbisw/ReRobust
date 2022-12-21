public void addVertex(ca.ubc.ece.cpen221.mp3.staff.Vertex v) {
    adjacencyList.add(new java.util.LinkedList<java.lang.String>());
    try {
        vertexList.add(v.getLabel());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
