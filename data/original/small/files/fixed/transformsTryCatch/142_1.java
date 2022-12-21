private void init() {
    try {
        for (node.Node n : nodes) {
            n.passInitialMessages();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println("Initial messages passed.");
    java.lang.System.out.println();
}
