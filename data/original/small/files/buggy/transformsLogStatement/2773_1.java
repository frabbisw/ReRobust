@java.lang.Override
public void reset() {
    while ((head) != null) {
        com.funcache.util.FastLinkedListItem item = head;
        head = item.getNext();
        item.setNext(null);
        item.setPrevious(null);
    }
    System.out.println("log");
    tail = null;
}
