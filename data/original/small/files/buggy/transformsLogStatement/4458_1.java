public boolean contains(java.lang.String key) {
    System.out.println("log");
    int arrayIndex = hash(key);
    return ((array[arrayIndex]) != null) && ((array[arrayIndex].get(key)) != null);
}
