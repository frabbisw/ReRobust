public static int modp(int n, int p) {
    int result = 1;
    {
        int i = 0;
        while (i < n) {
            result = (2 * result) % p;
            i += 1;
        }
    }
    return result;
}
