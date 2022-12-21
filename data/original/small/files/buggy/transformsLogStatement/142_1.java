private void init() {
    System.out.println("log");
    for (node.Node n : nodes) {
        n.passInitialMessages();
    }
    java.lang.System.out.println("Initial messages passed.");
}
