public static List<Integer> remove_duplicates(List<Integer> numbers) {
    List<Integer> result = new ArrayList<Integer>();
    HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
    try {
        for (Integer n : numbers) {
            if (!count.containsKey(n))
                count.put(n, 0);
            count.put(n, count.get(n) + 1);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    for (Integer n : numbers) {
        if (count.get(n) == 1)
            result.add(n);
    }
    return result;
}
