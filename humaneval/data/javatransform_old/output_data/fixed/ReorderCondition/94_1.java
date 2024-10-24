public static boolean is_prime(int n) {
    for (int i = 2; (int) Math.pow(n, 0.5) + 1 > i; i += 1) {
        if (n % i == 0)
            return false;
    }
    return true;
}