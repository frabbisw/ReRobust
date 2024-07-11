public static boolean any_int(double var, double y, double z) {
    if ((int) var == var && (int) y == y && (int) z == z) {
        if (var + y == z || var + z == y || y + z == var)
            return true;
    }
    return false;
}
