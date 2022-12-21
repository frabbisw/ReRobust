public com.dici.collection.DoublyLinkedList.Cursor<T> forwardCursor() {
    System.out.println("log");
    return new com.dici.collection.DoublyLinkedList.Cursor<>(this, first, defaultWay);
}
