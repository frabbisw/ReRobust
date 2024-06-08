public static boolean is_prime(int k) {
    if (k < 2)
        return false;
    for (int i = 2; i < k; i += 1) {
        if (0 == k % i)
            return false;
    }
    return true;
}
