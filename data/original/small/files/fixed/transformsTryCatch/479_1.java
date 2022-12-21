public void push(E element) {
    try {
        ensureCapacity(1);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    elements[((size)++)] = element;
}
