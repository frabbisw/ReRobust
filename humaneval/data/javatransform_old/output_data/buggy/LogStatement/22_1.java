public static int modp(int n, int p) {
    int result = 1;
    for (int i = 0; i < n; i += 1) {
        result = 2 * result;
    }
    System.out.println("log");
    return result % p;
}
