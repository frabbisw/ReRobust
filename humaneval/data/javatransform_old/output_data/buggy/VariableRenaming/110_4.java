public static int[] largest_smallest_integers(int[] lst) {
    boolean negative = true, positive = true;
    int var = Integer.MAX_VALUE, min_positive = Integer.MIN_VALUE;
    for (int i = 1; i < lst.length; i++) {
        if (lst[i] < 0) {
            negative = false;
            var = Math.min(var, lst[i]);
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
