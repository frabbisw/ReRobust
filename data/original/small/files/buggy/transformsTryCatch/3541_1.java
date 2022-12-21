public java.lang.Object get(int index) {
    try {
        indexRangeCheck(index);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.coding.basic.LinkedList.Node cursor = head;
    for (int i = 0; i < index; i++) {
        cursor = cursor.next;
    }
    return cursor.next;
}
