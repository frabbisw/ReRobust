public static List<Integer> incr_list(List<Integer> var) {
    List<Integer> result = new ArrayList<Integer>();
    for (Integer n : var) {
        result.add(n + 1);
    }
    return result;
}
