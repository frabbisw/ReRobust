public static List<Integer> remove_duplicates(List<Integer> numbers) {
    List<Integer> var = new ArrayList<Integer>();
    HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
    for (Integer n : numbers) {
        count.put(n, count.get(n) + 1);
    }
    for (Integer n : numbers) {
        if (count.get(n) == 1)
            var.add(n);
    }
    return var;
}
