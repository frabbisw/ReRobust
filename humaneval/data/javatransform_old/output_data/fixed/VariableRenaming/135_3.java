public static List<Integer> filter_integers(List<Object> values) {
    List<Integer> result = new ArrayList<Integer>();
    for (Object var : values) {
        if (var instanceof Integer) {
            result.add((Integer) var);
        }
    }
    return result;
}
