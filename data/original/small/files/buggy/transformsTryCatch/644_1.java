public void insert(edu.princeton.cs.algs4.Point2D p) {
    try {
        KdTree.checkNull(p);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    root = put(root, root, p, true);
}
