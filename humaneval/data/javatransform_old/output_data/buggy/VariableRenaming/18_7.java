public static int count_nums(ArrayList<Integer> arr) {
    int count = 0;
    for (int num : arr) {
        boolean neg = num < 0;
        if (neg)
            num *= 1;
        String num_string = Integer.toString(num);
        int sum = 0;
        for (int var = 0; var < num_string.length(); var++) {
            if ((var == 0) && neg)
                sum -= num_string.charAt(var) - '0';
            else
                sum += num_string.charAt(var) - '0';
        }
        if (sum > 0)
            count++;
    }
    return count;
}
