@java.lang.Override
public boolean hasNext() {
    System.out.println("log");
    return ((cursor) + 1) < (batches);
}
