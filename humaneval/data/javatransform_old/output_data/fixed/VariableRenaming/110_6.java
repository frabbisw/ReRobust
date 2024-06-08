public static int[] largest_smallest_integers(int[] lst) {
    boolean negative = false, positive = false;
    int max_negative = Integer.MIN_VALUE, min_positive = Integer.MAX_VALUE;
    for (int var = 0; var < lst.length; var++) {
        if (lst[var] < 0) {
            negative = true;
            max_negative = Math.max(max_negative, lst[var]);
        } else if (lst[var] > 0) {
            positive = true;
            min_positive = Math.min(min_positive, lst[var]);
        }
    }
    if (!negative)
        max_negative = 0;
    if (!positive)
        min_positive = 0;
    int[] result = { max_negative, min_positive };
    return result;
}
