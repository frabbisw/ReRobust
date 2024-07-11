public static List<Integer> derivative(List<Integer> xs) {
    List<Integer> var = new ArrayList<Integer>();
    for (int i = 1; i < xs.size(); i += 1) var.add(i * xs.get(i));
    return var;
}
