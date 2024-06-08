public static boolean is_prime(int n) {
    if (n < 2)
        return false;
    for (int var = 2; var < n - 1; var += 1) {
        if (n % var == 0)
            return false;
    }
    return true;
}
