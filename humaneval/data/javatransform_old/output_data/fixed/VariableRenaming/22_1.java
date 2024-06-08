public static int modp(int var, int p) {
    int result = 1;
    for (int i = 0; i < var; i += 1) {
        result = (2 * result) % p;
    }
    return result;
}
