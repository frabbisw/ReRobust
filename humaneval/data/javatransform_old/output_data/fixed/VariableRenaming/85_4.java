public static List<Integer> rolling_max(List<Integer> numbers) {
    List<Integer> result = new ArrayList<Integer>();
    Integer running_max = null;
    for (Integer var : numbers) {
        if (running_max == null) {
            running_max = var;
        } else {
            running_max = Math.max(running_max, var);
        }
        result.add(running_max);
    }
    return result;
}
