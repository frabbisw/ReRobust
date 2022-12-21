@java.lang.Override
public E previous() {
    try {
        if (hasPrevious())
            current = current.prev;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    throw new java.util.NoSuchElementException();
}
