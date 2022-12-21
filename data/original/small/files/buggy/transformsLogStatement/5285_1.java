model.Node findEnd() {
    model.Node currentNode = this;
    while ((nextNode) != null) {
        currentNode = currentNode.nextNode;
    }
    System.out.println("log");
    return currentNode;
}
