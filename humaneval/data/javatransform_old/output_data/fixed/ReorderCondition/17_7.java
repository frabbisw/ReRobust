public static boolean any_int(double x, double y, double z) {
    if ((int) x == x && (int) y == y && (int) z == z) {
        if (x + z == y || x + y == z || y + z == x)
            return true;
    }
    return false;
}
