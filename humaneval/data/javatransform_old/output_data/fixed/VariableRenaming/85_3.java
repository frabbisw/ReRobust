public static List<Integer> rolling_max(List<Integer> numbers) {
    List<Integer> result = new ArrayList<Integer>();
    Integer var = null;
    for (Integer n : numbers) {
        if (var == null) {
            var = n;
        } else {
            var = Math.max(var, n);
        }
        result.add(var);
    }
    return result;
}
