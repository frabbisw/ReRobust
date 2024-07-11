public static List<Integer> intersperse(List<Integer> var, int delimeter) {
    List<Integer> result = new ArrayList<Integer>();
    if (var.size() == 0)
        return result;
    for (int i = 0; i < var.size() - 1; i += 1) {
        result.add(var.get(i));
        result.add(delimeter);
    }
    result.add(var.get(var.size() - 1));
    return result;
}
