public static List<Integer> count_up_to(int n) {
    List<Integer> primes = new ArrayList<Integer>();
    for (int i = 2; i < n; i += 1) {
        boolean is_prime = true;
        for (int j = 2; j < i; j += 1) {
            if (0 == i % j) {
                is_prime = false;
                break;
            }
        }
        if (is_prime)
            primes.add(i);
    }
    return primes;
}
