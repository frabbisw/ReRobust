public static List<Integer> rolling_max(List<Integer> var) {
    List<Integer> result = new ArrayList<Integer>();
    Integer running_max = null;
    for (Integer n : var) {
        if (running_max == null) {
            running_max = n;
        } else {
            running_max = Math.max(running_max, n);
        }
        result.add(running_max);
    }
    return result;
}
