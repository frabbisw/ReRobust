public static String change_base(int x, int base) {
    String var = "";
    while (x > 0) {
        var = var + x % base;
        x = x - x / base;
    }
    return var;
}
