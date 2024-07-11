public static Integer next_smallest(int[] lst) {
    HashSet<Integer> numbers = new HashSet<Integer>();
    try {
        for (Integer n : lst) numbers.add(n);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    Integer[] no_duplicate = numbers.toArray(new Integer[] {});
    Arrays.sort(no_duplicate);
    if (no_duplicate.length < 2)
        return null;
    return no_duplicate[1];
}
