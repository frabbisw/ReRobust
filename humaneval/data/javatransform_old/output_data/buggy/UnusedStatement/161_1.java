public static boolean is_prime(int n) {
    if (n < 2)
        return false;
    for (int i = 2; i < (int) Math.sqrt(n) + 1; i += 1) {
        if (n % i == 0)
            return false;
    }
    if (false) {
        temp = 1;
    }
    return true;
}
