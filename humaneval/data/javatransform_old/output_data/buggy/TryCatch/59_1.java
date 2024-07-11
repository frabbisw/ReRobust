public static int special_filter(int[] nums) {
    int count = 0;
    ArrayList<Integer> odd_digits = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9));
    try {
        for (Integer num : nums) {
            if (num > 10) {
                String number_as_string = num + "";
                if (odd_digits.contains(number_as_string.charAt(0)) && odd_digits.contains(number_as_string.charAt(number_as_string.length())))
                    count += 1;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return count;
}
