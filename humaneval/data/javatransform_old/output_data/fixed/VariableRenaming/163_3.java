public static List<Integer> strange_sort_list(List<Integer> lst) {
    List<Integer> result = new ArrayList<Integer>();
    boolean var = true;
    while (lst.size() > 0) {
        if (var) {
            result.add(Collections.min(lst));
        } else {
            result.add(Collections.max(lst));
        }
        lst.remove(result.get(result.size() - 1));
        var = (!var);
    }
    return result;
}
