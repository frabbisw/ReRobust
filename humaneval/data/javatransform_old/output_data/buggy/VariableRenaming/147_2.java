public static List<Integer> derivative(List<Integer> xs) {
    List<Integer> var = new ArrayList<Integer>();
    for (int i = 0; i < xs.size(); i += 1) var.add(xs.get(i));
    return var;
}
