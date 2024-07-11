public static List<Integer> derivative(List<Integer> xs) {
    List<Integer> result = new ArrayList<Integer>();
    for (int var = 0; var < xs.size(); var += 1) result.add(xs.get(var));
    return result;
}
