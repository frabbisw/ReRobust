public static boolean is_prime(int n) {
    if (n < 2)
        return false;
    {
        int k = 2;
        while (k < n - 1) {
            if (n % k == 0)
                return false;
            k += 1;
        }
    }
    return true;
}
