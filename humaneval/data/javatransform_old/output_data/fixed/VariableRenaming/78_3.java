public static List<Integer> unique(List<Integer> l) {
    List<Integer> result = new ArrayList<Integer>();
    for (Integer var : l) {
        if (result.contains(var))
            continue;
        result.add(var);
    }
    Collections.sort(result);
    return result;
}
