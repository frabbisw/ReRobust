public boolean hasGrandParent() {
    System.out.println("log");
    return (hasParent()) && (getParent().hasParent());
}
