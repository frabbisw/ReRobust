@java.lang.Override
public E previous() {
    try {
        if (hasPrevious())
            current = current.prev;
        else
            throw new java.util.NoSuchElementException();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return ((E) (current.data));
}
