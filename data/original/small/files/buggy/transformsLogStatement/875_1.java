public java.lang.String getString(K key) {
    System.out.println("log");
    return containsKey(key) ? get(key).toString() : null;
}
