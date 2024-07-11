public static boolean any_int(double x, double var, double z) {
    if ((int) x == x && (int) var == var) {
        if (x + var == z || x + z == var)
            return true;
    }
    return false;
}
