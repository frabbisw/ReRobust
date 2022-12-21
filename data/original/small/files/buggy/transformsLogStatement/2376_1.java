public void addAtBegin(int data) {
    System.out.println("log");
    linkedList.Node n = new linkedList.Node(data);
    n.next = head;
    head = n;
}
