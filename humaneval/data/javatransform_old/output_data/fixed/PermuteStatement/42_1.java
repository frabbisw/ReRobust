public static ArrayList<Integer> unique_digits(ArrayList<Integer> x) {
    ArrayList<Integer> res = new ArrayList<Integer>();
    for (int i : x) {
        boolean all_odd = true;
        int num = i;
        while (num > 0) {
            int curr_digit = num % 10;
            if ((curr_digit % 2) == 0) {
                all_odd = false;
                break;
            }
            num /= 10;
        }
        if (all_odd) {
            res.add(i);
        }
    }
    Collections.sort(res);
    return res;
}
