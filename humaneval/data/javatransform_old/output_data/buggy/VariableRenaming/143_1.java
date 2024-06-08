public static int fibfib(int var) {
    if (var == 0)
        return 0;
    if (var == 1)
        return 0;
    return fibfib(var - 1) + fibfib(var - 2) + fibfib(var - 3);
}
