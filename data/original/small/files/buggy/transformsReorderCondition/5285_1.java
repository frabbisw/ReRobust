model.Node findEnd() {
    model.Node currentNode = this;
    while (null != (nextNode)) {
        currentNode = currentNode.nextNode;
    }
    return currentNode;
}
