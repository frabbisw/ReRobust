public static List<Integer> count_up_to(int n) {
    List<Integer> primes = new ArrayList<Integer>();
    for (int var = 2; var < n; var += 1) {
        boolean is_prime = false;
        for (int j = 2; j < var; j += 1) {
            if (var % j == 0) {
                is_prime = false;
            }
        }
        if (is_prime)
            primes.add(var);
    }
    return primes;
}
