public static boolean monotonic(int[] l) {
    int[] sorted = new int[l.length];
    int[] reverse_sorted = new int[l.length];
    sorted = l;
    try {
        Arrays.sort(sorted);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    for (int i = 0; i < l.length; i += 1) reverse_sorted[i] = sorted[l.length - i - 1];
    if (Arrays.equals(l, sorted) || Arrays.equals(l, reverse_sorted))
        return true;
    return false;
}
