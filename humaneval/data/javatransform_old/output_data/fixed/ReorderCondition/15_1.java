public static String change_base(int x, int base) {
    String result = "";
    while (0 < x) {
        result = (x % base) + result;
        x = (int) x / base;
    }
    return result;
}
