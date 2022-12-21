@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public java.util.Iterator<T> iterator() {
    System.out.println("log");
    return ((java.util.Iterator<T>) (com.arangodb.util.CollectionUtils.safetyIterator(results)));
}
