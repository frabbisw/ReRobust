public boolean contains(java.lang.Object o) {
    try {
        synchronized (map) {
            return map.containsKey(0);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
