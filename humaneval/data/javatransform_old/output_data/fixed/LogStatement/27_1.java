public static List<Integer> remove_duplicates(List<Integer> numbers) {
    System.out.println("log");
    List<Integer> result = new ArrayList<Integer>();
    HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
    for (Integer n : numbers) {
        if (!count.containsKey(n))
            count.put(n, 0);
        count.put(n, count.get(n) + 1);
    }
    for (Integer n : numbers) {
        if (count.get(n) == 1)
            result.add(n);
    }
    return result;
}
