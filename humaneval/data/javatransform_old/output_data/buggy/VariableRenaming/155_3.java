public static boolean is_simple_power(int x, int n) {
    int var = 1;
    while (var < x) {
        var *= n;
    }
    return var == x;
}
