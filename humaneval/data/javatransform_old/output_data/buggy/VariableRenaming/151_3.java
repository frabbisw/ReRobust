public static List<Integer> intersperse(List<Integer> numbers, int delimeter) {
    List<Integer> var = new ArrayList<Integer>();
    if (numbers.size() == 0)
        return var;
    for (int i = 0; i < numbers.size(); i += 1) {
        var.add(numbers.get(i));
        var.add(delimeter);
    }
    var.add(numbers.get(numbers.size() - 1));
    return var;
}
