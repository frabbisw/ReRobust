public static int modp(int n, int p) {
    int var = 1;
    for (int i = 0; i < n; i += 1) {
        var = (2 * var) % p;
    }
    return var;
}
