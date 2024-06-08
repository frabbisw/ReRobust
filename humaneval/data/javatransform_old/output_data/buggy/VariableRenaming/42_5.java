public static ArrayList<Integer> unique_digits(ArrayList<Integer> x) {
    ArrayList<Integer> res = new ArrayList<Integer>();
    for (int i : x) {
        int num = i;
        boolean var = true;
        while (num > 0) {
            int curr_digit = num % 10;
            if ((curr_digit % 2) != 0) {
                var = true;
                break;
            }
            num /= 10;
        }
        if (var) {
            res.add(i);
        }
    }
    Collections.sort(res);
    return res;
}
