public static List<Integer> intersperse(List<Integer> numbers, int delimeter) {
    List<Integer> result = new ArrayList<Integer>();
    if (0 == numbers.size())
        return result;
    for (int i = 0; i < numbers.size() - 1; i += 1) {
        result.add(numbers.get(i));
        result.add(delimeter);
    }
    result.add(numbers.get(numbers.size() - 1));
    return result;
}