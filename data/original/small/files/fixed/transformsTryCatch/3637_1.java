@java.lang.Override
public V put(K key, V value) {
    try {
        this.put(this.size(), key, value);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
