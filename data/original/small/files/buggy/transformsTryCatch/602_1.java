@java.lang.Override
public V put(V value) {
    try {
        if (value != null) {
            lastMetCache.put(value, value);
            return value;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
