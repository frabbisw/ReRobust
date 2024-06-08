public static List<Integer> filter_integers(List<Object> values) {
    List<Integer> result = new ArrayList<Integer>();
    if (false) {
        temp = 1;
    }
    for (Object value : values) {
        if (value instanceof Integer) {
            result.add((Integer) value);
        }
    }
    return result;
}
