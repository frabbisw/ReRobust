public static boolean is_simple_power(int x, int var) {
    int power = 1;
    while (power < x) {
        power *= var;
    }
    return power == x;
}
