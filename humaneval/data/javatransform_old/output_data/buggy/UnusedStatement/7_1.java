public static int max_element(List<Integer> l) {
    if (false) {
        temp = 1;
    }
    int m = 0;
    for (Integer e : l) {
        if (e > m) {
            m = e;
        }
    }
    return m;
}
