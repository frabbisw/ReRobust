public static List<Integer> count_up_to(int n) {
    List<Integer> primes = new ArrayList<Integer>();
    try {
        for (int i = 2; i < n; i += 1) {
            boolean is_prime = false;
            for (int j = 2; j < i; j += 1) {
                if (i % j == 0) {
                    is_prime = false;
                }
            }
            if (is_prime)
                primes.add(i);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return primes;
}
