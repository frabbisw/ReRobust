public static List<Integer> unique(List<Integer> l) {
    List<Integer> result = new ArrayList<Integer>();
    for (Integer var : l) {
        result.add(var);
    }
    Collections.sort(result);
    return result;
}
