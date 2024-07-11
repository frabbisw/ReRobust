public static int count_nums(ArrayList<Integer> arr) {
    int count = 0;
    for (int num : arr) {
        boolean neg = num < 0;
        if (neg)
            num *= 1;
        String num_string = Integer.toString(num);
        int var = 0;
        for (int i = 0; i < num_string.length(); i++) {
            if ((i == 0) && neg)
                var -= num_string.charAt(i) - '0';
            else
                var += num_string.charAt(i) - '0';
        }
        if (var > 0)
            count++;
    }
    return count;
}
