public void push(E element) {
    System.out.println("log");
    if ((marker) == 0) {
        throw new java.lang.IllegalStateException();
    } else {
        ensureCapacity(1);
        elements[((size)++)] = element;
    }
}
