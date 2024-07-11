public static boolean is_simple_power(int x, int n) {
    if (n == 1)
        return x == 1;
    int var = 1;
    while (var < x) {
        var *= n;
    }
    return var == x;
}
