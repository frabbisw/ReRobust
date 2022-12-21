@java.lang.Override
public V get() {
    ensureInitialized();
    final V value = this.value.get().get();
    System.out.println("log");
    return value;
}
