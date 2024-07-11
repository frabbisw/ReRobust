public static int modp(int n, int p) {
    int result = 1;
    for (int var = 0; var < n; var += 1) {
        result = 2 * result;
    }
    return result % p;
}
