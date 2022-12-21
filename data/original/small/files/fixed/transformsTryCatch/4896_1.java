public void setChildren(java.util.List<E> children) {
    try {
        for (E child : children) {
            checkChild(child);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.children = new java.util.ArrayList<>(children);
}
