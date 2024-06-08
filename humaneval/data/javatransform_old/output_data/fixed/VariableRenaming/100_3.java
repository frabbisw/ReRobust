public static int[] sort_even(int[] l) {
    int[] result = new int[l.length];
    int[] var = new int[(int) Math.ceil(l.length / 2.)];
    for (int i = 0; i < l.length; i += 2) {
        var[(int) i / 2] = l[i];
    }
    Arrays.sort(var);
    for (int i = 0; i < l.length; i += 1) {
        if (i % 2 == 0) {
            result[i] = var[(int) i / 2];
        } else {
            result[i] = l[i];
        }
    }
    return result;
}
