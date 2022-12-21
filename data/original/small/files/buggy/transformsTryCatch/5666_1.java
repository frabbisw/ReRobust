@java.lang.Override
public boolean remove(java.lang.Object o) {
    try {
        markAsStale();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return underlyingList.remove(o);
}
