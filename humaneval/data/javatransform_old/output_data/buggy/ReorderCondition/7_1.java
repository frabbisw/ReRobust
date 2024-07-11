public static int max_element(List<Integer> l) {
    int m = 0;
    for (Integer e : l) {
        if (m < e) {
            m = e;
        }
    }
    return m;
}
