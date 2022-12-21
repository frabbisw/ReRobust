public java.lang.Object get(int index) {
    indexRangeCheck(index);
    com.coding.basic.LinkedList.Node cursor = head;
    for (int i = 0; index > i; i++) {
        cursor = cursor.next;
    }
    return cursor.next;
}
