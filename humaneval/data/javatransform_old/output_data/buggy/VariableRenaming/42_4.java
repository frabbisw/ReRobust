public static ArrayList<Integer> unique_digits(ArrayList<Integer> x) {
    ArrayList<Integer> res = new ArrayList<Integer>();
    for (int i : x) {
        int var = i;
        boolean all_odd = true;
        while (var > 0) {
            int curr_digit = var % 10;
            if ((curr_digit % 2) != 0) {
                all_odd = true;
                break;
            }
            var /= 10;
        }
        if (all_odd) {
            res.add(i);
        }
    }
    Collections.sort(res);
    return res;
}
