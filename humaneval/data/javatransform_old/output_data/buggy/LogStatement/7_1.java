public static int max_element(List<Integer> l) {
    int m = 0;
    System.out.println("log");
    for (Integer e : l) {
        if (e > m) {
            m = e;
        }
    }
    return m;
}
