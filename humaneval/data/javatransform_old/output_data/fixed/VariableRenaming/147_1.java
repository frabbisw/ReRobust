public static List<Integer> derivative(List<Integer> var) {
    List<Integer> result = new ArrayList<Integer>();
    for (int i = 1; i < var.size(); i += 1) result.add(i * var.get(i));
    return result;
}
