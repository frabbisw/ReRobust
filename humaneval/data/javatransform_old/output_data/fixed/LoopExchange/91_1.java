public static boolean monotonic(int[] l) {
    int[] sorted = new int[l.length];
    int[] reverse_sorted = new int[l.length];
    System.arraycopy(l, 0, sorted, 0, l.length);
    Arrays.sort(sorted);
    {
        int i = 0;
        while (i < l.length) {
            reverse_sorted[i] = sorted[l.length - i - 1];
            i += 1;
        }
    }
    if (Arrays.equals(l, sorted) || Arrays.equals(l, reverse_sorted))
        return true;
    return false;
}
