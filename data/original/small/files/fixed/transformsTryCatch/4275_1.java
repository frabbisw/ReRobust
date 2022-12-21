public synchronized boolean moveShapeDown(int position) {
    if ((stateComponent.activeShapes[position]) == null)
        return false;
    boolean retVar = moveShapeDown(stateComponent.activeShapes[position]);
    try {
        if (retVar)
            putActiveShapeGhosts();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return retVar;
}
