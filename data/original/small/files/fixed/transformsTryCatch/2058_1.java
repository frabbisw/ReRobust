public int showDominatingSet() {
    java.util.Set<no.uib.ii.algo.st8.start.UnVertex> domset = no.uib.ii.algo.st8.algorithms.ExactDominatingSet.exactDominatingSet(graph.getGraph());
    clearAll();
    try {
        markedVertices.addAll(domset);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    redraw();
    return domset.size();
}
