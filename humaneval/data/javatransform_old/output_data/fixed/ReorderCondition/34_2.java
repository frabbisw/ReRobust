public static boolean is_prime(int n) {
    if (n < 2)
        return false;
    for (int k = 2; n - 1 > k; k += 1) {
        if (n % k == 0)
            return false;
    }
    return true;
}
