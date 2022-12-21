@java.lang.Override
public void reset() {
    try {
        for (com.funcache.util.FastLinkedListItem item = head; item != null; item = item.getNext()) {
            item.setNext(null);
            item.setPrevious(null);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    head = null;
    tail = null;
}
