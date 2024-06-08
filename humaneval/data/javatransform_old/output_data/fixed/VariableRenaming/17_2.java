public static boolean any_int(double x, double var, double z) {
    if ((int) x == x && (int) var == var && (int) z == z) {
        if (x + var == z || x + z == var || var + z == x)
            return true;
    }
    return false;
}
