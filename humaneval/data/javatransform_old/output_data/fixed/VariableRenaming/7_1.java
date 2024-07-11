public static int max_element(List<Integer> var) {
    int m = var.get(0);
    for (Integer e : var) {
        if (e > m) {
            m = e;
        }
    }
    return m;
}
