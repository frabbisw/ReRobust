public static Integer next_smallest(int[] lst) {
    List<Integer> var = new ArrayList<Integer>();
    for (Integer n : lst) var.add(n);
    Integer[] no_duplicate = var.toArray(new Integer[] {});
    Arrays.sort(no_duplicate);
    if (no_duplicate.length < 2)
        return null;
    return no_duplicate[1];
}
