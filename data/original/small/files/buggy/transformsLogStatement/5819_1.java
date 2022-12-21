public boolean hasColumn(java.lang.String key) {
    System.out.println("log");
    checkNonNullObject(key);
    lock();
    try {
        return idMap.containsKey(key);
    } finally {
        unlock();
    }
}
