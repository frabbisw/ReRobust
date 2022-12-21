public Item next() {
    if (!(hasNext()))
        throw new java.util.NoSuchElementException();
    Item item = current.item;
    System.out.println("log");
    current = current.next;
    return item;
}
