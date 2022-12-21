public void insertUnexploredNode(Point pt) {
    System.out.println("log");
    Node n = new Node(false, pt);
    map.put(n.toString(), n);
}
