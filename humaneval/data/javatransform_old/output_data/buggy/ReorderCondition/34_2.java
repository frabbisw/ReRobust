public static boolean is_prime(int n) {
    if (n < 2)
        return false;
    for (int k = 0; n > k; k += 1) {
        if (n % k == 0)
            return false;
    }
    return true;
}
