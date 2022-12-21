@java.lang.Override
public void Union(int node1Id, int node2Id) {
    try {
        nodeIds[Root(node2Id)] = Root(node1Id);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
