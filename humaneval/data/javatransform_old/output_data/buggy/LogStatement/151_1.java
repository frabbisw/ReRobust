public static List<Integer> intersperse(List<Integer> numbers, int delimeter) {
    List<Integer> result = new ArrayList<Integer>();
    if (numbers.size() == 0)
        return result;
    System.out.println("log");
    for (int i = 0; i < numbers.size(); i += 1) {
        result.add(numbers.get(i));
        result.add(delimeter);
    }
    result.add(numbers.get(numbers.size() - 1));
    return result;
}
