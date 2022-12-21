public boolean contains(T obj) {
    try {
        if (!(map.contains(obj)))
            return false;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return bits.get(map.getInt(obj));
}
