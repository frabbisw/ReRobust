public static List<Integer> unique(List<Integer> l) {
    List<Integer> var = new ArrayList<Integer>();
    for (Integer n : l) {
        if (var.contains(n))
            continue;
        var.add(n);
    }
    Collections.sort(var);
    return var;
}
