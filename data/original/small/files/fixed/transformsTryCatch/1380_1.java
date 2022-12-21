public java.lang.String remove(java.lang.String key) {
    int index = getIndex(key);
    try {
        if (storage[index].contains(key))
            (size)--;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return storage[index].remove(key);
}
