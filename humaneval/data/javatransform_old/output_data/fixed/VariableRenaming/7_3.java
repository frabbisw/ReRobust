public static int max_element(List<Integer> l) {
    int m = l.get(0);
    for (Integer var : l) {
        if (var > m) {
            m = var;
        }
    }
    return m;
}
