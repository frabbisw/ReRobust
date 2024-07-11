public static List<Integer> derivative(List<Integer> var) {
    List<Integer> result = new ArrayList<Integer>();
    for (int i = 0; i < var.size(); i += 1) result.add(var.get(i));
    return result;
}
