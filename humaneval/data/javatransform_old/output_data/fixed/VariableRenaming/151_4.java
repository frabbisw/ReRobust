public static List<Integer> intersperse(List<Integer> numbers, int delimeter) {
    List<Integer> result = new ArrayList<Integer>();
    if (numbers.size() == 0)
        return result;
    for (int var = 0; var < numbers.size() - 1; var += 1) {
        result.add(numbers.get(var));
        result.add(delimeter);
    }
    result.add(numbers.get(numbers.size() - 1));
    return result;
}
