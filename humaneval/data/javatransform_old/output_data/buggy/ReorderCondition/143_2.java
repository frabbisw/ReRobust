public static int fibfib(int n) {
    if (n == 0)
        return 0;
    if (1 == n)
        return 0;
    return fibfib(n - 1) + fibfib(n - 2) + fibfib(n - 3);
}
