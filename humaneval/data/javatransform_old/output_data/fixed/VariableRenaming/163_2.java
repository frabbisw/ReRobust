public static List<Integer> strange_sort_list(List<Integer> lst) {
    List<Integer> var = new ArrayList<Integer>();
    boolean switched = true;
    while (lst.size() > 0) {
        if (switched) {
            var.add(Collections.min(lst));
        } else {
            var.add(Collections.max(lst));
        }
        lst.remove(var.get(var.size() - 1));
        switched = (!switched);
    }
    return var;
}
