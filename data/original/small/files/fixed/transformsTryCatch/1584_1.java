public boolean contains(java.lang.Object o) {
    try {
        synchronized (map) {
            return map.containsKey(o);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
