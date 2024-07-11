public static List<Integer> get_positive(List<Integer> var) {
    List<Integer> result = new ArrayList<Integer>();
    for (Integer number : var) {
        if (number > 0) {
            result.add(number);
        }
    }
    return result;
}
