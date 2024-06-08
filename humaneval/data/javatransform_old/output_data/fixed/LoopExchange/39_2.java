public static List<Integer> count_up_to(int n) {
    List<Integer> primes = new ArrayList<Integer>();
    for (int i = 2; i < n; i += 1) {
        boolean is_prime = true;
        {
            int j = 2;
            while (j < i) {
                if (i % j == 0) {
                    is_prime = false;
                    break;
                }
                j += 1;
            }
        }
        if (is_prime)
            primes.add(i);
    }
    return primes;
}
