public static int[] sort_even(int[] l) {
    int[] result = new int[l.length];
    int[] evens = new int[1 + (int) (l.length / 2.)];
    for (int var = 0; var < l.length; var += 2) {
        evens[(int) var / 2] = l[var];
    }
    Arrays.sort(evens);
    for (int var = 0; var < l.length; var += 1) {
        if (var % 2 == 0) {
            result[var] = evens[(int) var / 2];
        } else {
            result[var] = l[var];
        }
    }
    return result;
}
