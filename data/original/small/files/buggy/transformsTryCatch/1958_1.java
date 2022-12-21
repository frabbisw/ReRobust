@java.lang.Override
public boolean addConnection(com.horstmann.violet.product.diagram.abstracts.edge.IEdge edge) {
    try {
        if ((edge.getStartNode()) == (edge.getEndNode())) {
            return false;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return super.addConnection(edge);
}
