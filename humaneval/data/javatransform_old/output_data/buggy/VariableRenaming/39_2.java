public static List<Integer> count_up_to(int n) {
    List<Integer> var = new ArrayList<Integer>();
    for (int i = 2; i < n; i += 1) {
        boolean is_prime = false;
        for (int j = 2; j < i; j += 1) {
            if (i % j == 0) {
                is_prime = false;
            }
        }
        if (is_prime)
            var.add(i);
    }
    return var;
}
