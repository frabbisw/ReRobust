public static List<Integer> incr_list(List<Integer> l) {
    List<Integer> result = new ArrayList<Integer>();
    for (Integer var : l) {
        result.add(var + 1);
    }
    return result;
}
