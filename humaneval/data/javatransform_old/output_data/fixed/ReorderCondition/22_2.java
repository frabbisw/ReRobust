public static int modp(int n, int p) {
    int result = 1;
    for (int i = 0; i < n; i += 1) {
        result = (result * 2) % p;
    }
    return result;
}
