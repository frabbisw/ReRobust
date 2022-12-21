public boolean hasGrandParent() {
    return (getParent().hasParent()) && (hasParent());
}
