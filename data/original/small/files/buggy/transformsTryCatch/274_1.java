@lists.linkedlist.tests.Test
void setObject() {
    lists.linkedlist.ListNode<java.lang.String> listNode = new lists.linkedlist.ListNode<java.lang.String>("Blabla");
    try {
        listNode.setObject("lorem ipsum");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    assertEquals("lorem ipsum", listNode.getObject());
}
