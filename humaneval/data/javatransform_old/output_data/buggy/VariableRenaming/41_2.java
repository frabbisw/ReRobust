public static boolean is_prime(int k) {
    if (k < 2)
        return false;
    for (int var = 2; var < k; var += 1) {
        if (k % var == 0)
            return false;
    }
    return true;
}
