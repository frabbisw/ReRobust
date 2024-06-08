public static ArrayList<Integer> unique_digits(ArrayList<Integer> x) {
    ArrayList<Integer> var = new ArrayList<Integer>();
    for (int i : x) {
        int num = i;
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
            var.add(i);
        }
    }
    Collections.sort(var);
    return var;
}
