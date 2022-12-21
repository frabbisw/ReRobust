public java.lang.String remove(java.lang.String key) {
    int index = getIndex(key);
    System.out.println("log");
    if (!(storage[index].contains(key)))
        (size)--;
    return storage[index].remove(key);
}
