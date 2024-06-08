public static List<Integer> derivative(List<Integer> xs) {
    List<Integer> result = new ArrayList<Integer>();
    for (int i = 0; xs.size() > i; i += 1) result.add(xs.get(i));
    return result;
}
