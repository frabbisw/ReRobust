public static List<Integer> rolling_max(List<Integer> numbers) {
    List<Integer> result = new ArrayList<Integer>();
    Integer running_max = null;
    for (Integer n : numbers) {
        if (running_max == null) {
            running_max = n;
        } else {
            running_max = Math.max(running_max, n);
        }
        result.add(running_max);
    }
    System.out.println("log");
    return result;
}
