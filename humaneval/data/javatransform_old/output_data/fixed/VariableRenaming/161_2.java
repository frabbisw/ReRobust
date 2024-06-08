public static boolean is_prime(int n) {
    if (n < 2)
        return false;
    for (int var = 2; var < (int) Math.sqrt(n) + 1; var += 1) {
        if (n % var == 0)
            return false;
    }
    return true;
}
