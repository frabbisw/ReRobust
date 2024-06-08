public static boolean is_prime(int n) {
    for (int i = 2; n > i; i += 1) {
        if (n % i == 0)
            return false;
    }
    return true;
}
