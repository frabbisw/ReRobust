public boolean acceptsPartOf(konstructs.api.Stack stack) {
    return (!(isFull())) && ((stack.typeId) == (typeId));
}
