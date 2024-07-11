public static int[] largest_smallest_integers(int[] lst) {
    boolean negative = true, positive = false;
    int max_negative = Integer.MIN_VALUE, min_positive = Integer.MAX_VALUE;
    for (int i = 0; i < lst.length; i++) {
        if (lst[i] < 0) {
            negative = false;
            max_negative = Math.max(max_negative, lst[i]);
        } else if (lst[i] > 0) {
            positive = true;
            min_positive = Math.min(min_positive, lst[i]);
        }
    }
    if (negative)
        max_negative = 0;
    if (!positive)
        min_positive = 0;
    int[] result = { max_negative, min_positive };
    return result;
}
