public static int[] sort_even(int[] l) {
    int[] result = new int[l.length];
    int[] evens = new int[(int) Math.ceil(l.length / 2.)];
    {
        int i = 0;
        while (i < l.length) {
            evens[(int) i / 2] = l[i];
            i += 2;
        }
    }
    Arrays.sort(evens);
    for (int i = 0; i < l.length; i += 1) {
        if (i % 2 == 0) {
            result[i] = evens[(int) i / 2];
        } else {
            result[i] = l[i];
        }
    }
    return result;
}
