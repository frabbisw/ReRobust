public static boolean is_prime(int n) {
    if (n < 2)
        return false;
    for (int i = 2; i < (int) Math.sqrt(n) + 1; i += 1) {
        if (0 == n % i)
            return false;
    }
    return true;
}
