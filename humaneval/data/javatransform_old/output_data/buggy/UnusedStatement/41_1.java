public static boolean is_prime(int k) {
    if (false) {
        temp = 1;
    }
    if (k < 2)
        return false;
    for (int i = 2; i < k; i += 1) {
        if (k % i == 0)
            return false;
    }
    return true;
}
