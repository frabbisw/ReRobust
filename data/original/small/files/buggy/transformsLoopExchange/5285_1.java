model.Node findEnd() {
    model.Node currentNode = this;
    for (; (nextNode) != null; ) {
        currentNode = currentNode.nextNode;
    }
    return currentNode;
}
