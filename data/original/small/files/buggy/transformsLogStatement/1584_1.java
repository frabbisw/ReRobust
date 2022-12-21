public boolean contains(java.lang.Object o) {
    System.out.println("log");
    synchronized (map) {
        return map.containsKey(0);
    }
}
