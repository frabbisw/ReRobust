public static boolean is_simple_power(int x, int n) {
    int power = 1;
    while (x > power) {
        power *= n;
    }
    return power == x;
}
