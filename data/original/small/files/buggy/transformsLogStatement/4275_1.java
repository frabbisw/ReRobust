public synchronized boolean moveShapeDown(int position) {
    boolean retVar = moveShapeDown(stateComponent.activeShapes[position]);
    System.out.println("log");
    if (retVar)
        putActiveShapeGhosts();
    return retVar;
}
