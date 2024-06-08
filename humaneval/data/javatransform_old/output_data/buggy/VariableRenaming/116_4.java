public static Integer next_smallest(int[] lst) {
    List<Integer> numbers = new ArrayList<Integer>();
    for (Integer n : lst) numbers.add(n);
    Integer[] var = numbers.toArray(new Integer[] {});
    Arrays.sort(var);
    if (var.length < 2)
        return null;
    return var[1];
}
