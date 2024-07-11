public static List<Integer> filter_integers(List<Object> var) {
    List<Integer> result = new ArrayList<Integer>();
    for (Object value : var) {
        result.add((Integer) value);
    }
    return result;
}
