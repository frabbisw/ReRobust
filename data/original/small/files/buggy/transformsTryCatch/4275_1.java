public synchronized boolean moveShapeDown(int position) {
    boolean retVar = moveShapeDown(stateComponent.activeShapes[position]);
    try {
        if (retVar)
            putActiveShapeGhosts();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return retVar;
}
