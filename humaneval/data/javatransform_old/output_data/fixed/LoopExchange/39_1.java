public static List<Integer> count_up_to(int n) {
    List<Integer> primes = new ArrayList<Integer>();
    {
        int i = 2;
        while (i < n) {
            boolean is_prime = true;
            for (int j = 2; j < i; j += 1) {
                if (i % j == 0) {
                    is_prime = false;
                    break;
                }
            }
            if (is_prime)
                primes.add(i);
            i += 1;
        }
    }
    return primes;
}
