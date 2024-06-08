public static List<Integer> get_positive(List<Integer> numbers) {
    List<Integer> var = new ArrayList<Integer>();
    for (Integer number : numbers) {
        if (number > 0) {
            var.add(number);
        }
    }
    return var;
}
