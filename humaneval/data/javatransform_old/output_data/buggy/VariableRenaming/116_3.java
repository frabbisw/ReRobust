public static Integer next_smallest(int[] lst) {
    List<Integer> numbers = new ArrayList<Integer>();
    for (Integer var : lst) numbers.add(var);
    Integer[] no_duplicate = numbers.toArray(new Integer[] {});
    Arrays.sort(no_duplicate);
    if (no_duplicate.length < 2)
        return null;
    return no_duplicate[1];
}
