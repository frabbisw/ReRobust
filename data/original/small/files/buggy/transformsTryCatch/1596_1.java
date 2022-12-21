public synchronized boolean moveShapeRight(int position) {
    boolean retVar = moveShape(1, 0, stateComponent.activeShapes[position]);
    try {
        if (retVar)
            putActiveShapeGhosts();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return retVar;
}
