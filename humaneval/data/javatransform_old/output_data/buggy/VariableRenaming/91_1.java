public static boolean monotonic(int[] var) {
    int[] sorted = new int[var.length];
    int[] reverse_sorted = new int[var.length];
    sorted = var;
    Arrays.sort(sorted);
    for (int i = 0; i < var.length; i += 1) reverse_sorted[i] = sorted[var.length - i - 1];
    if (Arrays.equals(var, sorted) || Arrays.equals(var, reverse_sorted))
        return true;
    return false;
}
