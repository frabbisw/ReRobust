public static List<Integer> strange_sort_list(List<Integer> lst) {
    List<Integer> result = new ArrayList<Integer>();
    System.out.println("log");
    boolean switched = true;
    while (lst.size() > 0) {
        if (switched) {
            result.add(Collections.min(lst));
        } else {
            result.add(Collections.max(lst));
        }
        lst.remove(result.get(result.size() - 1));
        switched = (!switched);
    }
    return result;
}
