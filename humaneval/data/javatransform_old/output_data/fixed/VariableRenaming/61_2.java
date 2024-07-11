public static Integer[] order_by_points(Integer[] nums) {
    ArrayList<Integer> var = new ArrayList<Integer>();
    HashMap<Integer, ArrayList<Integer>> digits_number = new HashMap<Integer, ArrayList<Integer>>();
    for (int i = 0; i < nums.length; i += 1) {
        int neg = 1;
        int n = nums[i];
        if (n < 0) {
            n = -1 * n;
            neg = -1;
        }
        int digit = 0;
        for (int j = 0; j < (n + "").toCharArray().length; j += 1) {
            if (j == 0)
                digit += ((n + "").toCharArray()[j] - '0') * neg;
            else
                digit += (n + "").toCharArray()[j] - '0';
        }
        if (!var.contains(digit))
            var.add(digit);
        if (!digits_number.containsKey(digit))
            digits_number.put(digit, new ArrayList<Integer>());
        digits_number.get(digit).add(nums[i]);
    }
    Collections.sort(var);
    ArrayList<Integer> result = new ArrayList<Integer>();
    for (int i = 0; i < var.size(); i += 1) {
        result.addAll(digits_number.get(var.get(i)));
    }
    return result.toArray(new Integer[] {});
}
