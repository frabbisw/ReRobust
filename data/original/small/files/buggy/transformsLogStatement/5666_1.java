@java.lang.Override
public boolean remove(java.lang.Object o) {
    System.out.println("log");
    markAsStale();
    return underlyingList.remove(o);
}
