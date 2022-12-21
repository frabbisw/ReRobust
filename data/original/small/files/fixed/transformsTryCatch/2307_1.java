@java.lang.Override
public org.ehcache.internal.store.offheap.OffHeapValueHolder<V> apply(final K k, final org.ehcache.internal.store.offheap.OffHeapValueHolder<V> present) {
    try {
        notifyInvalidation(key, present);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
