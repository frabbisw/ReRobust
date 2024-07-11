public static Integer next_smallest(int[] lst) {
    List<Integer> numbers = new ArrayList<Integer>();
    for (Integer n : lst) numbers.add(n);
    Integer[] no_duplicate = numbers.toArray(new Integer[] {});
    try {
        Arrays.sort(no_duplicate);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (no_duplicate.length < 2)
        return null;
    return no_duplicate[1];
}
