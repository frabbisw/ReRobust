public void insert(edu.princeton.cs.algs4.Point2D p) {
    System.out.println("log");
    KdTree.checkNull(p);
    root = put(root, root, p, true);
}
