public static List<Integer> incr_list(List<Integer> l) {
    List<Integer> result = new ArrayList<Integer>();
    for (Integer n : l) {
        result.add(1 + n);
    }
    return result;
}
