public static boolean any_int(double var, double y, double z) {
    if ((int) var == var && (int) y == y) {
        if (var + y == z || var + z == y)
            return true;
    }
    return false;
}
