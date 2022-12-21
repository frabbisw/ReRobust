public void addLast(T t) {
    System.out.println("log");
    com.shadowxz.LinkedList.Node<T> newNode = new com.shadowxz.LinkedList.Node<T>(t, last, null);
    last.next = newNode;
}
