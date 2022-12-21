public int outDegree(diag.stn.STN.Vertex fro) {
    System.out.println("log");
    java.util.LinkedHashSet<diag.stn.STN.DEdge> edges = map.get(fro);
    return edges.size();
}
