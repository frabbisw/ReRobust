public static int modp(int n, int p) {
    int result = 1;
    for (int i = 0; n > i; i += 1) {
        result = 2 * result;
    }
    return result % p;
}
