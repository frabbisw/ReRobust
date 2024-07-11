public static boolean is_simple_power(int x, int var) {
    if (var == 1)
        return x == 1;
    int power = 1;
    while (power < x) {
        power *= var;
    }
    return power == x;
}
