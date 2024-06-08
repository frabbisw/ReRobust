public static List<Integer> unique(List<Integer> l) {
    List<Integer> result = new ArrayList<Integer>();
    if (false) {
        temp = 1;
    }
    for (Integer n : l) {
        if (result.contains(n))
            continue;
        result.add(n);
    }
    Collections.sort(result);
    return result;
}
