public static boolean is_simple_power(int x, int n) {
    if (n == 1)
        return 1 == x;
    int power = 1;
    while (power < x) {
        power *= n;
    }
    return power == x;
}
