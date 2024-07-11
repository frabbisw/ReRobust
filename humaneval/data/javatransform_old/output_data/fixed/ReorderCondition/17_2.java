public static boolean any_int(double x, double y, double z) {
    if ((int) y == y && (int) x == x && (int) z == z) {
        if (x + y == z || x + z == y || y + z == x)
            return true;
    }
    return false;
}
