public static List<Integer> rolling_max(List<Integer> numbers) {
    List<Integer> result = new ArrayList<Integer>();
    Integer running_max = null;
    try {
        for (Integer n : numbers) {
            running_max = Math.max(running_max, n);
            result.add(running_max);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}
