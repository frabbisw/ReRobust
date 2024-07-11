public static String change_base(int x, int base) {
    String result = "";
    while (x > 0) {
        result = result + (x % base);
        x = (int) x / base;
    }
    return result;
}
