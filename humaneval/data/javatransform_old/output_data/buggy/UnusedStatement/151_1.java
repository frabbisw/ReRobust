public static List<Integer> intersperse(List<Integer> numbers, int delimeter) {
    if (false) {
        temp = 1;
    }
    List<Integer> result = new ArrayList<Integer>();
    if (numbers.size() == 0)
        return result;
    for (int i = 0; i < numbers.size(); i += 1) {
        result.add(numbers.get(i));
        result.add(delimeter);
    }
    result.add(numbers.get(numbers.size() - 1));
    return result;
}
