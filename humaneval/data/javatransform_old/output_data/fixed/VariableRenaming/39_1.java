public static List<Integer> count_up_to(int var) {
    List<Integer> primes = new ArrayList<Integer>();
    for (int i = 2; i < var; i += 1) {
        boolean is_prime = true;
        for (int j = 2; j < i; j += 1) {
            if (i % j == 0) {
                is_prime = false;
                break;
            }
        }
        if (is_prime)
            primes.add(i);
    }
    return primes;
}
