public static List<Integer> derivative(List<Integer> xs) {
    System.out.println("log");
    List<Integer> result = new ArrayList<Integer>();
    for (int i = 1; i < xs.size(); i += 1) result.add(i * xs.get(i));
    return result;
}
