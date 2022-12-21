@java.lang.Override
public void reset() {
    try {
        while ((head) != null) {
            com.funcache.util.FastLinkedListItem item = head;
            head = item.getNext();
            item.setNext(null);
            item.setPrevious(null);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    tail = null;
}
