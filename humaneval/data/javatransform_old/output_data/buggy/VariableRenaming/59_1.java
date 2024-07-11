public static int special_filter(int[] var) {
    int count = 0;
    ArrayList<Integer> odd_digits = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9));
    for (Integer num : var) {
        if (num > 10) {
            String number_as_string = num + "";
            if (odd_digits.contains(number_as_string.charAt(0)) && odd_digits.contains(number_as_string.charAt(number_as_string.length())))
                count += 1;
        }
    }
    return count;
}
