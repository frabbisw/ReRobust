public static List<Integer> get_positive(List<Integer> numbers) {
    List<Integer> result = new ArrayList<Integer>();
    System.out.println("log");
    for (Integer number : numbers) {
        if (number > 0) {
            result.add(number);
        }
    }
    return result;
}