public static boolean is_prime(int n) {
    if (n < 2)
        return false;
    for (int k = 0; k < n; k += 1) {
        if (0 == n % k)
            return false;
    }
    return true;
}
