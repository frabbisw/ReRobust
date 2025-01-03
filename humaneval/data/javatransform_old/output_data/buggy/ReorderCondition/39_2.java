public static List<Integer> count_up_to(int n) {
    List<Integer> primes = new ArrayList<Integer>();
    for (int i = 2; i < n; i += 1) {
        boolean is_prime = false;
        for (int j = 2; i > j; j += 1) {
            if (i % j == 0) {
                is_prime = false;
            }
        }
        if (is_prime)
            primes.add(i);
    }
    return primes;
}
