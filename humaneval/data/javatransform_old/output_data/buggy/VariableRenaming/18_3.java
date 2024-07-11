public static int count_nums(ArrayList<Integer> arr) {
    int count = 0;
    for (int var : arr) {
        boolean neg = var < 0;
        if (neg)
            var *= 1;
        String num_string = Integer.toString(var);
        int sum = 0;
        for (int i = 0; i < num_string.length(); i++) {
            if ((i == 0) && neg)
                sum -= num_string.charAt(i) - '0';
            else
                sum += num_string.charAt(i) - '0';
        }
        if (sum > 0)
            count++;
    }
    return count;
}
