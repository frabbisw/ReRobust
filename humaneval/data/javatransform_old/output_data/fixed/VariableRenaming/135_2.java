public static List<Integer> filter_integers(List<Object> values) {
    List<Integer> var = new ArrayList<Integer>();
    for (Object value : values) {
        if (value instanceof Integer) {
            var.add((Integer) value);
        }
    }
    return var;
}
