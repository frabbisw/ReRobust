@java.lang.Override
public org.ehcache.internal.store.offheap.OffHeapValueHolder<V> apply(final K k, final org.ehcache.internal.store.offheap.OffHeapValueHolder<V> present) {
    System.out.println("log");
    notifyInvalidation(key, getValue(present));
    return null;
}
