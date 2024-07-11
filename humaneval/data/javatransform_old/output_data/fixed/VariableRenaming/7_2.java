public static int max_element(List<Integer> l) {
    int var = l.get(0);
    for (Integer e : l) {
        if (e > var) {
            var = e;
        }
    }
    return var;
}
