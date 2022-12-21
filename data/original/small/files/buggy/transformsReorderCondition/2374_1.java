@java.lang.Override
public org.w3c.dom.Node getParentNode() {
    final int parent = document.attrParent[nodeNumber];
    if (0 < parent) {
        return document.getNode(parent);
    }
    return null;
}
