public static ArrayList<Integer> unique_digits(ArrayList<Integer> x) {
    ArrayList<Integer> res = new ArrayList<Integer>();
    for (int var : x) {
        int num = var;
        boolean all_odd = true;
        while (num > 0) {
            int curr_digit = num % 10;
            if ((curr_digit % 2) == 0) {
                all_odd = false;
                break;
            }
            num /= 10;
        }
        if (all_odd) {
            res.add(var);
        }
    }
    Collections.sort(res);
    return res;
}
