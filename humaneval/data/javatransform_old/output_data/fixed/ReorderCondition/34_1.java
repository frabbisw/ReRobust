public static boolean is_prime(int n) {
    if (2 > n)
        return false;
    for (int k = 2; k < n - 1; k += 1) {
        if (n % k == 0)
            return false;
    }
    return true;
}
