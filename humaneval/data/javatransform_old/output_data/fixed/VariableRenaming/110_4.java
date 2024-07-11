public static int[] largest_smallest_integers(int[] lst) {
    boolean negative = false, positive = false;
    int var = Integer.MIN_VALUE, min_positive = Integer.MAX_VALUE;
    for (int i = 0; i < lst.length; i++) {
        if (lst[i] < 0) {
            negative = true;
            var = Math.max(var, lst[i]);
        } else if (lst[i] > 0) {
            positive = true;
            min_positive = Math.min(min_positive, lst[i]);
        }
    }
    if (!negative)
        var = 0;
    if (!positive)
        min_positive = 0;
    int[] result = { var, min_positive };
    return result;
}
