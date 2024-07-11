public static List<Integer> get_positive(List<Integer> numbers) {
    List<Integer> result = new ArrayList<Integer>();
    for (Integer number : numbers) {
        if (0 < number) {
            result.add(number);
        }
    }
    return result;
}
