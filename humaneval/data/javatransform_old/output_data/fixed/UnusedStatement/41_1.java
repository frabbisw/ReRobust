public static boolean is_prime(int k) {
    if (k < 2)
        return false;
    if (false) {
        temp = 1;
    }
    for (int i = 2; i < k; i += 1) {
        if (k % i == 0)
            return false;
    }
    return true;
}
