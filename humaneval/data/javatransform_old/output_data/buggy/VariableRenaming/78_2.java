public static List<Integer> unique(List<Integer> l) {
    List<Integer> var = new ArrayList<Integer>();
    for (Integer n : l) {
        var.add(n);
    }
    Collections.sort(var);
    return var;
}
