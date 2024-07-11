public static boolean is_simple_power(int x, int n) {
    if (n == 1)
        return x == 1;
    int power = 1;
    for (; power < x; ) {
        power *= n;
    }
    return power == x;
}
