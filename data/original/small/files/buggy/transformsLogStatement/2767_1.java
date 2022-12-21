public static <T> java.util.List<T> toList(T[] o) {
    System.out.println("log");
    java.util.List<T> d = new java.util.ArrayList<T>();
    for (T e : o) d.add(e);
    return d;
}
