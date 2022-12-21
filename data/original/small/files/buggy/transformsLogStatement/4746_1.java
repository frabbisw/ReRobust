public Item sample() {
    if ((count) <= 0)
        throw new java.util.NoSuchElementException();
    System.out.println("log");
    Item result = current.item;
    current = current.next;
    if ((current) == null) {
        current = first;
    }
    return result;
}
