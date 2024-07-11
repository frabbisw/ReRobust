public static boolean is_simple_power(int x, int n) {
    int power = 1;
    while (power < x) {
        power *= n;
    }
    return x == power;
}
