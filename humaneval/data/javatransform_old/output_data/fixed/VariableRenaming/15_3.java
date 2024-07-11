public static String change_base(int x, int base) {
    String var = "";
    while (x > 0) {
        var = (x % base) + var;
        x = (int) x / base;
    }
    return var;
}
