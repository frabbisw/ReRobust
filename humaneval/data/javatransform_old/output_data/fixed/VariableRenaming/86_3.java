public static long min_subarray_sum(ArrayList<Long> nums) {
    long max_sum = 0;
    long var = 0;
    for (long num : nums) {
        var += -num;
        if (var < 0) {
            var = 0;
        }
        max_sum = Math.max(var, max_sum);
    }
    if (max_sum == 0) {
        max_sum = -nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            max_sum = Math.max(max_sum, -nums.get(i));
        }
    }
    long min_sum = -max_sum;
    return min_sum;
}
