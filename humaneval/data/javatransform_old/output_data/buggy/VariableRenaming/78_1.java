public static List<Integer> unique(List<Integer> var) {
    List<Integer> result = new ArrayList<Integer>();
    for (Integer n : var) {
        result.add(n);
    }
    Collections.sort(result);
    return result;
}
