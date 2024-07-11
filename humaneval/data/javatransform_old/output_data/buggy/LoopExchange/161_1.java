public static boolean is_prime(int n) {
    if (n < 2)
        return false;
    {
        int i = 2;
        while (i < (int) Math.sqrt(n) + 1) {
            if (n % i == 0)
                return false;
            i += 1;
        }
    }
    return true;
}
