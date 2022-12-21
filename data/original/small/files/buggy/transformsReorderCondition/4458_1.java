public boolean contains(java.lang.String key) {
    int arrayIndex = hash(key);
    return ((array[arrayIndex].get(key)) != null) && ((array[arrayIndex]) != null);
}
