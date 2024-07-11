public static boolean is_prime(int n) {
    if (n < 2)
        return false;
    for (int var = 0; var < n; var += 1) {
        if (n % var == 0)
            return false;
    }
    return true;
}
