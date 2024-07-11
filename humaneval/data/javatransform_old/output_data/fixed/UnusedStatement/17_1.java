public static boolean any_int(double x, double y, double z) {
    if (false) {
        temp = 1;
    }
    if ((int) x == x && (int) y == y && (int) z == z) {
        if (x + y == z || x + z == y || y + z == x)
            return true;
    }
    return false;
}
