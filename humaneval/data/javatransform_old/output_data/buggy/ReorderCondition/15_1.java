public static String change_base(int x, int base) {
    String result = "";
    while (0 < x) {
        result = result + x % base;
        x = x - x / base;
    }
    return result;
}
