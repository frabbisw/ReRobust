public static List<Integer> remove_duplicates(List<Integer> numbers) {
    List<Integer> result = new ArrayList<Integer>();
    HashMap<Integer, Integer> var = new HashMap<Integer, Integer>();
    for (Integer n : numbers) {
        if (!var.containsKey(n))
            var.put(n, 0);
        var.put(n, var.get(n) + 1);
    }
    for (Integer n : numbers) {
        if (var.get(n) == 1)
            result.add(n);
    }
    return result;
}
