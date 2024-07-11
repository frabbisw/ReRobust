public static long min_subarray_sum(ArrayList<Long> nums) {
    long max_sum = 0;
    long s = 0;
    for (long num : nums) {
        s += -num;
        if (s < 0) {
            s = 0;
        }
        max_sum = Math.max(s, max_sum);
    }
    if (max_sum == 0) {
        max_sum = -nums.get(0);
        {
            int i = 1;
            while (i < nums.size()) {
                max_sum = Math.max(max_sum, -nums.get(i));
                i++;
            }
        }
    }
    long min_sum = -max_sum;
    return min_sum;
}
