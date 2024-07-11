public static int special_filter(int[] nums) {
    int count = 0;
    ArrayList<Integer> odd_digits = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9));
    for (Integer num : nums) {
        if (num > 10) {
            String var = num + "";
            if (odd_digits.contains(var.charAt(0)) && odd_digits.contains(var.charAt(var.length())))
                count += 1;
        }
    }
    return count;
}
