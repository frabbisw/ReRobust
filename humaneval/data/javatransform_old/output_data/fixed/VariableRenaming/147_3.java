public static List<Integer> derivative(List<Integer> xs) {
    List<Integer> result = new ArrayList<Integer>();
    for (int var = 1; var < xs.size(); var += 1) result.add(var * xs.get(var));
    return result;
}
