public static Integer[] order_by_points(Integer[] nums) {
    ArrayList<Integer> digits = new ArrayList<Integer>();
    HashMap<Integer, ArrayList<Integer>> digits_number = new HashMap<Integer, ArrayList<Integer>>();
    for (int var = 0; var < nums.length; var += 1) {
        int neg = 1;
        int n = nums[var];
        if (n < 0) {
            n = -1 * n;
            neg = -1;
        }
        int digit = 0;
        for (int j = 0; j < (n + "").toCharArray().length; j += 1) {
            digit += ((n + "").toCharArray()[j] - '0') * neg;
        }
        digits.add(digit);
        if (!digits_number.containsKey(digit))
            digits_number.put(digit, new ArrayList<Integer>());
        digits_number.get(digit).add(nums[var]);
    }
    Collections.sort(digits);
    ArrayList<Integer> result = new ArrayList<Integer>();
    for (int var = 0; var < digits.size(); var += 1) {
        result.addAll(digits_number.get(digits.get(var)));
    }
    return result.toArray(new Integer[] {});
}
