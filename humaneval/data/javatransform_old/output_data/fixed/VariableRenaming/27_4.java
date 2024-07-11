public static List<Integer> remove_duplicates(List<Integer> numbers) {
    List<Integer> result = new ArrayList<Integer>();
    HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
    for (Integer var : numbers) {
        if (!count.containsKey(var))
            count.put(var, 0);
        count.put(var, count.get(var) + 1);
    }
    for (Integer var : numbers) {
        if (count.get(var) == 1)
            result.add(var);
    }
    return result;
}
