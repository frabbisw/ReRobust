public static boolean monotonic(int[] l) {
    int[] sorted = new int[l.length];
    int[] reverse_sorted = new int[l.length];
    System.arraycopy(l, 0, sorted, 0, l.length);
    Arrays.sort(sorted);
    for (int var = 0; var < l.length; var += 1) reverse_sorted[var] = sorted[l.length - var - 1];
    if (Arrays.equals(l, sorted) || Arrays.equals(l, reverse_sorted))
        return true;
    return false;
}
