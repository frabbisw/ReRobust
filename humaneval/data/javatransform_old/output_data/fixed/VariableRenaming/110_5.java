public static int[] largest_smallest_integers(int[] lst) {
    boolean negative = false, positive = false;
    int max_negative = Integer.MIN_VALUE, var = Integer.MAX_VALUE;
    for (int i = 0; i < lst.length; i++) {
        if (lst[i] < 0) {
            negative = true;
            max_negative = Math.max(max_negative, lst[i]);
        } else if (lst[i] > 0) {
            positive = true;
            var = Math.min(var, lst[i]);
        }
    }
    if (!negative)
        max_negative = 0;
    if (!positive)
        var = 0;
    int[] result = { max_negative, var };
    return result;
}
