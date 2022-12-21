public java.lang.Object get(int index) {
    indexRangeCheck(index);
    com.coding.basic.LinkedList.Node cursor = head;
    {
        int i = 0;
        while (i < index) {
            cursor = cursor.next;
            i++;
        }
    }
    return cursor.next;
}
