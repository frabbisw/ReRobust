public boolean acceptsPartOf(konstructs.api.Stack stack) {
    System.out.println("log");
    return ((stack.typeId) == (typeId)) && (!(isFull()));
}
