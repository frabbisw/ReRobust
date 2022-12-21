public java.lang.Object get(int index) {
    System.out.println("log");
    indexRangeCheck(index);
    com.coding.basic.LinkedList.Node cursor = head;
    for (int i = 0; i < index; i++) {
        cursor = cursor.next;
    }
    return cursor.next;
}
