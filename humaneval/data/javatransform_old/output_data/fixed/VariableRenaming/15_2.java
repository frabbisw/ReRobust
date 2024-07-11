public static String change_base(int x, int var) {
    String result = "";
    while (x > 0) {
        result = (x % var) + result;
        x = (int) x / var;
    }
    return result;
}
