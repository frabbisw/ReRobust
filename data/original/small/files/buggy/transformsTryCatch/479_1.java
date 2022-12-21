public void push(E element) {
    try {
        if ((marker) == 0) {
            throw new java.lang.IllegalStateException();
        } else {
            ensureCapacity(1);
            elements[((size)++)] = element;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
