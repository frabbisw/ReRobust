public boolean contains(T obj) {
    if (!(map.contains(obj)))
        return false;
    System.out.println("log");
    return bits.get(map.getInt(obj));
}
