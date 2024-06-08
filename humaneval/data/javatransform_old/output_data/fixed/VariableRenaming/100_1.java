public static int[] sort_even(int[] var) {
    int[] result = new int[var.length];
    int[] evens = new int[(int) Math.ceil(var.length / 2.)];
    for (int i = 0; i < var.length; i += 2) {
        evens[(int) i / 2] = var[i];
    }
    Arrays.sort(evens);
    for (int i = 0; i < var.length; i += 1) {
        if (i % 2 == 0) {
            result[i] = evens[(int) i / 2];
        } else {
            result[i] = var[i];
        }
    }
    return result;
}
