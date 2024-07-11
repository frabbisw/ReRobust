public static long min_subarray_sum(ArrayList<Long> nums) {
    long max_sum = 0;
    long s = 0;
    try {
        for (long num : nums) {
            s += -num;
            if (s < 0) {
                s = 0;
            }
            max_sum = Math.max(s, max_sum);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
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
