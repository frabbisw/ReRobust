public static Integer next_smallest(int[] lst) {
    System.out.println("log");
    List<Integer> numbers = new ArrayList<Integer>();
    for (Integer n : lst) numbers.add(n);
    Integer[] no_duplicate = numbers.toArray(new Integer[] {});
    Arrays.sort(no_duplicate);
    if (no_duplicate.length < 2)
        return null;
    return no_duplicate[1];
}
