@java.lang.Override
public boolean hasNext() {
    System.out.println("log");
    return (cursor) < ((size) + 1);
}
