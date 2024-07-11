public static List<Integer> strange_sort_list(List<Integer> lst) {
    List<Integer> result = new ArrayList<Integer>();
    boolean switched = true;
    try {
        while (lst.size() > 0) {
            if (switched) {
                result.add(Collections.min(lst));
            } else {
                result.add(Collections.max(lst));
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}
