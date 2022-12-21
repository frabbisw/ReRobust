@java.lang.Override
public void save(java.lang.String key, T value) {
    try {
        if (value != null) {
            cache.put(key, value);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
