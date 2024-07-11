public static List<Integer> remove_duplicates(List<Integer> var) {
    List<Integer> result = new ArrayList<Integer>();
    HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
    for (Integer n : var) {
        count.put(n, count.get(n) + 1);
    }
    for (Integer n : var) {
        if (count.get(n) == 1)
            result.add(n);
    }
    return result;
}
