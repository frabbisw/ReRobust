public static int fib(int var) {
    if (var == 0 || var == 1)
        return var;
    return fib(var - 1) + fib(var - 2);
}
