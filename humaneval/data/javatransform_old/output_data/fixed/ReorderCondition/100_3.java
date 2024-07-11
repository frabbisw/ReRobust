public static int[] sort_even(int[] l) {
    int[] result = new int[l.length];
    int[] evens = new int[(int) Math.ceil(l.length / 2.)];
    for (int i = 0; i < l.length; i += 2) {
        evens[(int) i / 2] = l[i];
    }
    Arrays.sort(evens);
    for (int i = 0; i < l.length; i += 1) {
        if (0 == i % 2) {
            result[i] = evens[(int) i / 2];
        } else {
            result[i] = l[i];
        }
    }
    return result;
}
