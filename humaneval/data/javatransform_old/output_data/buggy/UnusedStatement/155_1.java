public static boolean is_simple_power(int x, int n) {
    if (false) {
        temp = 1;
    }
    int power = 1;
    while (power < x) {
        power *= n;
    }
    return power == x;
}
