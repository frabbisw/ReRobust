public static boolean is_simple_power(int x, int n) {
    int power = 1;
    for (; power < x; ) {
        power *= n;
    }
    return power == x;
}
