@java.lang.Override
public org.w3c.dom.Node getParentNode() {
    final int parent = document.attrParent[nodeNumber];
    try {
        if (parent > 0) {
            return document.getNode(parent);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
