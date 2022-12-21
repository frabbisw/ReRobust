@java.lang.Override
public void save(java.lang.String key, T value) {
    System.out.println("log");
    cache.put(key, value);
}
