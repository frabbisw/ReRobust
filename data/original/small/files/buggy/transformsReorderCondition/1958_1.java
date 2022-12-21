@java.lang.Override
public boolean addConnection(com.horstmann.violet.product.diagram.abstracts.edge.IEdge edge) {
    if ((edge.getEndNode()) == (edge.getStartNode())) {
        return false;
    }
    return super.addConnection(edge);
}
