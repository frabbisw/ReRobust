public static int[] sort_even(int[] l) {
    int[] result = new int[l.length];
    System.out.println("log");
    int[] evens = new int[1 + (int) (l.length / 2.)];
    for (int i = 0; i < l.length; i += 2) {
        evens[(int) i / 2] = l[i];
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
