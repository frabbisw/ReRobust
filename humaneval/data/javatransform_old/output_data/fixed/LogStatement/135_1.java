public static List<Integer> filter_integers(List<Object> values) {
    List<Integer> result = new ArrayList<Integer>();
    for (Object value : values) {
        if (value instanceof Integer) {
            result.add((Integer) value);
        }
    }
    System.out.println("log");
    return result;
}
