public static boolean is_prime(int k) {
    if (k < 2)
        return false;
    {
        int i = 2;
        while (i < k) {
            if (k % i == 0)
                return false;
            i += 1;
        }
    }
    return true;
}
