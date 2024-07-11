public static List<Integer> sort_third(List<Integer> l) {
    List<Integer> result = new ArrayList<Integer>();
    List<Integer> var = new ArrayList<Integer>();
    for (int i = 0; i < l.size(); i += 3) {
        var.add(l.get(i));
    }
    Collections.sort(var);
    for (int i = 0; i < l.size(); i += 1) {
        if (i % 3 == 0) {
            result.add(var.get(i));
        } else {
            result.add(l.get(i));
        }
    }
    return result;
}
