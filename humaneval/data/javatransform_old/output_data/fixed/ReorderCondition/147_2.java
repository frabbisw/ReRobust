public static List<Integer> derivative(List<Integer> xs) {
    List<Integer> result = new ArrayList<Integer>();
    for (int i = 1; i < xs.size(); i += 1) result.add(xs.get(i) * i);
    return result;
}
