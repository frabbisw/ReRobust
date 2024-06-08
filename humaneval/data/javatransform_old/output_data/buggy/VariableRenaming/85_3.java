public static List<Integer> rolling_max(List<Integer> numbers) {
    List<Integer> result = new ArrayList<Integer>();
    Integer var = null;
    for (Integer n : numbers) {
        var = Math.max(var, n);
        result.add(var);
    }
    return result;
}
