public static List<Integer> strange_sort_list(List<Integer> lst) {
    boolean switched = true;
    List<Integer> result = new ArrayList<Integer>();
    while (lst.size() > 0) {
        if (switched) {
            result.add(Collections.min(lst));
        } else {
            result.add(Collections.max(lst));
        }
    }
    return result;
}
