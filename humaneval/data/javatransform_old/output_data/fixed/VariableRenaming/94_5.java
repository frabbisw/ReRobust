public static boolean is_prime(int n) {
    for (int var = 2; var < (int) Math.pow(n, 0.5) + 1; var += 1) {
        if (n % var == 0)
            return false;
    }
    return true;
}
