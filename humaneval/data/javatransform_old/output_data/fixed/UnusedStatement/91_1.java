public static boolean monotonic(int[] l) {
    int[] sorted = new int[l.length];
    int[] reverse_sorted = new int[l.length];
    if (false) {
        temp = 1;
    }
    System.arraycopy(l, 0, sorted, 0, l.length);
    Arrays.sort(sorted);
    for (int i = 0; i < l.length; i += 1) reverse_sorted[i] = sorted[l.length - i - 1];
    if (Arrays.equals(l, sorted) || Arrays.equals(l, reverse_sorted))
        return true;
    return false;
}
