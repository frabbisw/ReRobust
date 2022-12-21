public void setChildren(java.util.List<E> children) {
    for (E child : children) {
        checkChild(child);
    }
    System.out.println("log");
    this.children = children;
}
