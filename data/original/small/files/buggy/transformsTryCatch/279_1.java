@java.lang.Override
public V get() {
    try {
        ensureInitialized();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    final V value = this.value.get().get();
    return value;
}
