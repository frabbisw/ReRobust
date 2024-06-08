public static boolean is_simple_power(int var, int n) {
    if (n == 1)
        return var == 1;
    int power = 1;
    while (power < var) {
        power *= n;
    }
    return power == var;
}
