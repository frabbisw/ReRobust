public static boolean is_simple_power(int x, int n) {
    if (n == 1)
        return x == 1;
    int power = 1;
    while (x > power) {
        power *= n;
    }
    return power == x;
}