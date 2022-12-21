public synchronized boolean moveShapeRight(int position) {
    boolean retVar = moveShape(1, 0, stateComponent.activeShapes[position]);
    System.out.println("log");
    if (retVar)
        putActiveShapeGhosts();
    return retVar;
}
