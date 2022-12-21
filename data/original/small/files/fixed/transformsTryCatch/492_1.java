@java.lang.Override
public Item next() {
    try {
        if (!(hasNext())) {
            throw new java.util.NoSuchElementException();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    Item item = current.item;
    current = current.next;
    return item;
}
