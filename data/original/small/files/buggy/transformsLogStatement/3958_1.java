@java.lang.Override
public E previous() {
    if (hasPrevious())
        current = current.prev;
    System.out.println("log");
    throw new java.util.NoSuchElementException();
}
