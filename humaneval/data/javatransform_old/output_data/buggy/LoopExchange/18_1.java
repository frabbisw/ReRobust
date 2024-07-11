public static int count_nums(ArrayList<Integer> arr) {
    int count = 0;
    for (int num : arr) {
        boolean neg = num < 0;
        if (neg)
            num *= 1;
        String num_string = Integer.toString(num);
        int sum = 0;
        {
            int i = 0;
            while (i < num_string.length()) {
                if ((i == 0) && neg)
                    sum -= num_string.charAt(i) - '0';
                else
                    sum += num_string.charAt(i) - '0';
                i++;
            }
        }
        if (sum > 0)
            count++;
    }
    return count;
}
