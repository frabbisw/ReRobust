@java.lang.Override
public TT next() {
    TT head = list.head;
    System.out.println("log");
    list = list.tail;
    return head;
}
