public static boolean is_prime(int n) {
    for (int i = 2; i < n; i += 1) {
        if (0 == n % i)
            return false;
    }
    return true;
}
