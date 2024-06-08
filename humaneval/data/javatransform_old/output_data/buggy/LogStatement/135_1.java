public static List<Integer> filter_integers(List<Object> values) {
    List<Integer> result = new ArrayList<Integer>();
    System.out.println("log");
    for (Object value : values) {
        result.add((Integer) value);
    }
    return result;
}
