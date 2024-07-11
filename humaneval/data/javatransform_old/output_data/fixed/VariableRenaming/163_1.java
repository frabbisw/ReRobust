public static List<Integer> strange_sort_list(List<Integer> var) {
    List<Integer> result = new ArrayList<Integer>();
    boolean switched = true;
    while (var.size() > 0) {
        if (switched) {
            result.add(Collections.min(var));
        } else {
            result.add(Collections.max(var));
        }
        var.remove(result.get(result.size() - 1));
        switched = (!switched);
    }
    return result;
}
