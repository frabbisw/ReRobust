public static boolean monotonic(int[] l) {
    int[] sorted = new int[l.length];
    int[] reverse_sorted = new int[l.length];
    sorted = l;
    Arrays.sort(sorted);
    for (int i = 0; i < l.length; i += 1) reverse_sorted[i] = sorted[l.length - i - 1];
    if (Arrays.equals(l, reverse_sorted) || Arrays.equals(l, sorted))
        return true;
    return false;
}
