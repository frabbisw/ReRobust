public static List<Integer> rolling_max(List<Integer> numbers) {
    List<Integer> result = new ArrayList<Integer>();
    Integer running_max = null;
    for (Integer var : numbers) {
        running_max = Math.max(running_max, var);
        result.add(running_max);
    }
    return result;
}
