public static boolean is_prime(int n) {
    for (int i = 2; i < (int) Math.pow(n, 0.5) + 1; i += 1) {
        if (0 == n % i)
            return false;
    }
    return true;
}
