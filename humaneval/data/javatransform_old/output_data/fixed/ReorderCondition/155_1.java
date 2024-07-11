public static boolean is_simple_power(int x, int n) {
    if (1 == n)
        return x == 1;
    int power = 1;
    while (power < x) {
        power *= n;
    }
    return power == x;
}
