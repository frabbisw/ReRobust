public static int[] largest_smallest_integers(int[] lst) {
    boolean negative = true, positive = true;
    int max_negative = Integer.MAX_VALUE, min_positive = Integer.MIN_VALUE;
    for (int var = 1; var < lst.length; var++) {
        if (lst[var] < 0) {
            negative = false;
            max_negative = Math.min(max_negative, lst[var]);
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
