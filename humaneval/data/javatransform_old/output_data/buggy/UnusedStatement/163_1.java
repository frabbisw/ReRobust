public static List<Integer> strange_sort_list(List<Integer> lst) {
    List<Integer> result = new ArrayList<Integer>();
    if (false) {
        temp = 1;
    }
    boolean switched = true;
    while (lst.size() > 0) {
        if (switched) {
            result.add(Collections.min(lst));
        } else {
            result.add(Collections.max(lst));
        }
    }
    return result;
}