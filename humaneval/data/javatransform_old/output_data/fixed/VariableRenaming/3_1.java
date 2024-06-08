public static int greatest_common_divisor(int var, int b) {
    while (b > 0) {
        int tmp = var;
        var = b;
        b = tmp % b;
    }
    return var;
}
