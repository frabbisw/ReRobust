public static boolean any_int(double x, double y, double z) {
    if ((int) z == z && (int) x == x && (int) y == y) {
        if (x + y == z || x + z == y || y + z == x)
            return true;
    }
    return false;
}
