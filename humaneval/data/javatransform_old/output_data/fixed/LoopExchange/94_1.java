public static boolean is_prime(int n) {
    {
        int i = 2;
        while (i < (int) Math.pow(n, 0.5) + 1) {
            if (n % i == 0)
                return false;
            i += 1;
        }
    }
    return true;
}
