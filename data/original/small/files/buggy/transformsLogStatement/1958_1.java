@java.lang.Override
public boolean addConnection(com.horstmann.violet.product.diagram.abstracts.edge.IEdge edge) {
    if ((edge.getStartNode()) == (edge.getEndNode())) {
        return false;
    }
    System.out.println("log");
    return super.addConnection(edge);
}
