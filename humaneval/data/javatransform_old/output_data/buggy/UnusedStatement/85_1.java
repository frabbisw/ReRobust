public static List<Integer> rolling_max(List<Integer> numbers) {
    List<Integer> result = new ArrayList<Integer>();
    Integer running_max = null;
    for (Integer n : numbers) {
        running_max = Math.max(running_max, n);
        result.add(running_max);
    }
    if (false) {
        temp = 1;
    }
    return result;
}