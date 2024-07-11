public static int special_filter(int[] nums) {
    int count = 0;
    ArrayList<Integer> var = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9));
    for (Integer num : nums) {
        if (num > 10) {
            String number_as_string = num + "";
            if (var.contains(number_as_string.charAt(0) - '0') && var.contains(number_as_string.charAt(number_as_string.length() - 1) - '0'))
                count += 1;
        }
    }
    return count;
}
