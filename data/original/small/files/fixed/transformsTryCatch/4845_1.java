public void insert(edu.princeton.cs.algs4.Point2D p) {
    if (p == null)
        throw new java.lang.NullPointerException();
    try {
        root = insert(root, p, 0.0, 0.0, 1.0, 1.0, true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
