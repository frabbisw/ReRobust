public static long min_subarray_sum(ArrayList<Long> nums) {
    long var = 0;
    long s = 0;
    for (long num : nums) {
        s += num;
        if (s < 0) {
            s = 0;
        }
        var = Math.max(s, var);
    }
    if (var == 0) {
        var = -nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            var = Math.max(var, -nums.get(i));
        }
    }
    long min_sum = -var;
    return min_sum;
}
