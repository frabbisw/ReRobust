public static List<Integer> remove_duplicates(List<Integer> numbers) {
    List<Integer> result = new ArrayList<Integer>();
    HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
    for (Integer n : numbers) {
        count.put(n, count.get(n) + 1);
    }
    for (Integer n : numbers) {
        if (1 == count.get(n))
            result.add(n);
    }
    return result;
}
