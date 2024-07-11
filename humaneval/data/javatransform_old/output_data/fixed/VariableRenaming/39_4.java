public static List<Integer> count_up_to(int n) {
    List<Integer> primes = new ArrayList<Integer>();
    for (int i = 2; i < n; i += 1) {
        boolean var = true;
        for (int j = 2; j < i; j += 1) {
            if (i % j == 0) {
                var = false;
                break;
            }
        }
        if (var)
            primes.add(i);
    }
    return primes;
}
