@java.lang.Override
public V put(V value) {
    if (null != value) {
        lastMetCache.put(value, value);
        return value;
    }
    return null;
}
