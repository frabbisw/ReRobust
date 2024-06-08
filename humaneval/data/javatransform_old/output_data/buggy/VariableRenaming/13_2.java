public static List<Integer> incr_list(List<Integer> l) {
    List<Integer> var = new ArrayList<Integer>();
    for (Integer n : l) {
        var.add(n - 1);
    }
    return var;
}
