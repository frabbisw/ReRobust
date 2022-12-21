public void insertUnexploredNode(Point pt) {
    Node n = new Node(false, pt);
    try {
        map.put(n.toString(), n);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
