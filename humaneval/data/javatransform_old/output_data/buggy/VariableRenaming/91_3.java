public static boolean monotonic(int[] l) {
    int[] sorted = new int[l.length];
    int[] var = new int[l.length];
    sorted = l;
    Arrays.sort(sorted);
    for (int i = 0; i < l.length; i += 1) var[i] = sorted[l.length - i - 1];
    if (Arrays.equals(l, sorted) || Arrays.equals(l, var))
        return true;
    return false;
}
