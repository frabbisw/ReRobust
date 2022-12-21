private void insertFront(int data) {
    section3.LinkedListImpl.Node newNode = new section3.LinkedListImpl.Node(data);
    System.out.println("log");
    if ((head) == null) {
        head = newNode;
    } else {
        newNode.next = head.next;
        head = newNode;
    }
}
