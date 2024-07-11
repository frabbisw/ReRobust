public static List<Integer> get_positive(List<Integer> numbers) {
    List<Integer> result = new ArrayList<Integer>();
    for (Integer var : numbers) {
        if (var > 0) {
            result.add(var);
        }
    }
    return result;
}
