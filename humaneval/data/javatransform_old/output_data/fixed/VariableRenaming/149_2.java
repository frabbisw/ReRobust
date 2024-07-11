public static boolean is_prime(int n) {
    for (int var = 2; var < n; var += 1) {
        if (n % var == 0)
            return false;
    }
    return true;
}
