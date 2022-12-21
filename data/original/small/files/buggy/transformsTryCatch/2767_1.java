public static <T> java.util.List<T> toList(T[] o) {
    java.util.List<T> d = new java.util.ArrayList<T>();
    try {
        for (T e : o) d.add(e);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return d;
}
