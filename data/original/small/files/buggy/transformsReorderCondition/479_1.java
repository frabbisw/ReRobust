public void push(E element) {
    if (0 == (marker)) {
        throw new java.lang.IllegalStateException();
    } else {
        ensureCapacity(1);
        elements[((size)++)] = element;
    }
}
