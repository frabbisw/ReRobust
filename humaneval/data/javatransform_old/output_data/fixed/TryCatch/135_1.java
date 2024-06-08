public static List<Integer> filter_integers(List<Object> values) {
    List<Integer> result = new ArrayList<Integer>();
    try {
        for (Object value : values) {
            if (value instanceof Integer) {
                result.add((Integer) value);
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}
