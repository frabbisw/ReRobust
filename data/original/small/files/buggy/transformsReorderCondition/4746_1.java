public Item sample() {
    if (0 >= (count))
        throw new java.util.NoSuchElementException();
    Item result = current.item;
    current = current.next;
    if ((current) == null) {
        current = first;
    }
    return result;
}
