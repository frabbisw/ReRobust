public static int count_nums(ArrayList<Integer> arr) {
    int count = 0;
    for (int num : arr) {
        boolean var = num < 0;
        if (var)
            num *= -1;
        String num_string = Integer.toString(num);
        int sum = 0;
        for (int i = 0; i < num_string.length(); i++) {
            if ((i == 0) && var)
                sum -= num_string.charAt(i) - '0';
            else
                sum += num_string.charAt(i) - '0';
        }
        if (sum > 0)
            count++;
    }
    return count;
}
