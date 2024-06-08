public static boolean is_simple_power(int var, int n) {
    int power = 1;
    while (power < var) {
        power *= n;
    }
    return power == var;
}
