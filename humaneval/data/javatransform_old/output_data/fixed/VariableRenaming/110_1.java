public static int[] largest_smallest_integers(int[] var) {
    boolean negative = false, positive = false;
    int max_negative = Integer.MIN_VALUE, min_positive = Integer.MAX_VALUE;
    for (int i = 0; i < var.length; i++) {
        if (var[i] < 0) {
            negative = true;
            max_negative = Math.max(max_negative, var[i]);
        } else if (var[i] > 0) {
            positive = true;
            min_positive = Math.min(min_positive, var[i]);
        }
    }
    if (!negative)
        max_negative = 0;
    if (!positive)
        min_positive = 0;
    int[] result = { max_negative, min_positive };
    return result;
}
