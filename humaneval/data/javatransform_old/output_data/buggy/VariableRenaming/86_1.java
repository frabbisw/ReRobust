public static long min_subarray_sum(ArrayList<Long> var) {
    long max_sum = 0;
    long s = 0;
    for (long num : var) {
        s += num;
        if (s < 0) {
            s = 0;
        }
        max_sum = Math.max(s, max_sum);
    }
    if (max_sum == 0) {
        max_sum = -var.get(0);
        for (int i = 1; i < var.size(); i++) {
            max_sum = Math.max(max_sum, -var.get(i));
        }
    }
    long min_sum = -max_sum;
    return min_sum;
}
