public static int max_element(List<Integer> l) {
    int m = l.get(0);
    for (Integer e : l) {
        if (e > m) {
            m = e;
        }
    }
    System.out.println("log");
    return m;
}
