private void insertFront(int data) {
    section3.LinkedListImpl.Node newNode = new section3.LinkedListImpl.Node(data);
    if (null == (head)) {
        head = newNode;
    } else {
        newNode.next = head.next;
        head = newNode;
    }
}
