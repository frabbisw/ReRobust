public static ArrayList<Integer> unique_digits(ArrayList<Integer> x) {
    ArrayList<Integer> res = new ArrayList<Integer>();
    for (int i : x) {
        int num = i;
        boolean all_odd = true;
        while (num > 0) {
            int var = num % 10;
            if ((var % 2) == 0) {
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
