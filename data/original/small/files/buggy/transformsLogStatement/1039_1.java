public java.util.List<core.Circle> retrieve(java.util.List<core.Circle> returnObjects, core.Circle c) {
    System.out.println("log");
    return retrieve(returnObjects, quad.QuadTree.getRectangleFromCircle(c));
}
