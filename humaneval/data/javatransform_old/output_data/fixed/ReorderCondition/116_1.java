public static Integer next_smallest(int[] lst) {
    HashSet<Integer> numbers = new HashSet<Integer>();
    for (Integer n : lst) numbers.add(n);
    Integer[] no_duplicate = numbers.toArray(new Integer[] {});
    Arrays.sort(no_duplicate);
    if (2 > no_duplicate.length)
        return null;
    return no_duplicate[1];
}
