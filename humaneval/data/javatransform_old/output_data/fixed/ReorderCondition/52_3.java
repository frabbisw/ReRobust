public static int fib(int n) {
    if (n == 0 || 1 == n)
        return n;
    return fib(n - 1) + fib(n - 2);
}
