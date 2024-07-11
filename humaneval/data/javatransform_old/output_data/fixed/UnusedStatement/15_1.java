public static String change_base(int x, int base) {
    String result = "";
    if (false) {
        temp = 1;
    }
    while (x > 0) {
        result = (x % base) + result;
        x = (int) x / base;
    }
    return result;
}
