public static boolean monotonic(int[] l) {
    int[] var = new int[l.length];
    int[] reverse_sorted = new int[l.length];
    System.arraycopy(l, 0, var, 0, l.length);
    Arrays.sort(var);
    for (int i = 0; i < l.length; i += 1) reverse_sorted[i] = var[l.length - i - 1];
    if (Arrays.equals(l, var) || Arrays.equals(l, reverse_sorted))
        return true;
    return false;
}
