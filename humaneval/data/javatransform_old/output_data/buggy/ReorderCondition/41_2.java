public static boolean is_prime(int k) {
    if (k < 2)
        return false;
    for (int i = 2; k > i; i += 1) {
        if (k % i == 0)
            return false;
    }
    return true;
}
